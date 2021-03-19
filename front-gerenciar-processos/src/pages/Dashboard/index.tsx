import React from 'react';
import { FiPower } from 'react-icons/fi';
import { Container, Header, HeaderContent, Profile } from './styles';

import logoImg from '../../assets/logo.svg';
import { useAuth } from '../../hooks/auth';

const Dashboard: React.FC = () => {
  const { signOut, usuario } = useAuth();
  return (
    <Container>
      <Header>
        <HeaderContent>
          <img src={logoImg} alt="Softplan" />

          <Profile>
            <img
              src="https://img.favpng.com/8/19/8/united-states-avatar-organization-information-png-favpng-J9DvUE98TmbHSUqsmAgu3FpGw.jpg"
              alt={usuario.username}
            />
            <div>
              <span>Bem-vindo</span>
              <strong>{usuario.username}</strong>
            </div>
          </Profile>
          <button type="button" onClick={signOut}>
            <FiPower />
          </button>
        </HeaderContent>
      </Header>
    </Container>
  );
};
export default Dashboard;
