import React, { createContext, useCallback, useState, useContext } from 'react';
import api from '../services/api';

interface Usuario {
  id: string;
  username: string;
}

interface AuthState {
  token: string;
  usuario: Usuario;
}

interface SignInCredentials {
  email: string;
  senha: string;
}

interface AuthContextData {
  usuario: Usuario;
  signIn(credentials: SignInCredentials): Promise<void>;
  signOut(): void;
}

const AuthContext = createContext<AuthContextData>({} as AuthContextData);

const AuthProvider: React.FC = ({ children }) => {
  const [data, setData] = useState<AuthState>(() => {
    const token = localStorage.getItem('@GerenciarProcessos:token');
    const usuario = localStorage.getItem('@GerenciarProcessos:usuario');

    if (token && usuario) {
      return { token, usuario: JSON.parse(usuario) };
    }

    return {} as AuthState;
  });

  const signIn = useCallback(async ({ email, senha }) => {
    const response = await api.post('sessoes', {
      email,
      senha,
    });
    console.log('adasdasd', response.data);
    const { usuario } = response.data;
    const token = response.data.jwt;

    localStorage.setItem('@GerenciarProcessos:token', token);
    localStorage.setItem(
      '@GerenciarProcessos:usuario',
      JSON.stringify(usuario),
    );

    setData({ token, usuario });
  }, []);

  const signOut = useCallback(() => {
    localStorage.removeItem('@GerenciarProcessos:token');
    localStorage.removeItem('@GerenciarProcessos:usuario');

    setData({} as AuthState);
  }, []);

  return (
    <AuthContext.Provider value={{ usuario: data.usuario, signIn, signOut }}>
      {children}
    </AuthContext.Provider>
  );
};

function useAuth(): AuthContextData {
  const context = useContext(AuthContext);

  if (!context) {
    throw new Error('useAuth  must be used within an AuthProvider');
  }

  return context;
}

export { AuthProvider, useAuth };
