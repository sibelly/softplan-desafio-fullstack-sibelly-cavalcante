INSERT INTO usuarios (nome, email, senha, funcao) VALUES
  ('Admin', 'admin@email.com', '$2a$10$MJnFcOvRxXzZCec9uFmUUu9aVsTFtoyv265RLQl5mQz33d7u2v59a','ADMIN'),
  ('Triador', 'triador@email.com', '$2a$10$MJnFcOvRxXzZCec9uFmUUu9aVsTFtoyv265RLQl5mQz33d7u2v59a', 'TRIADOR'),
  ('Finalizador', 'finalizador@email.com', '$2a$10$MJnFcOvRxXzZCec9uFmUUu9aVsTFtoyv265RLQl5mQz33d7u2v59a', 'FINALIZADOR');

INSERT INTO processos (descricao) VALUES
  ('Processo 1'),
  ('Processo 2'),
  ('Processo 3');

INSERT INTO processos_usuarios (usuario_id, processo_id) VALUES
  (3, 1),
  (3, 2),
  (3, 3);

INSERT INTO pareceres (descricao, usuario_id, processo_id) VALUES
  ('Parecer 1', 3, 1),
  ('Parecer 2', 3, 2),
  ('Parecer 3', 3, 3);


