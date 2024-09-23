version: "3.9"

services:
  pgadmin4:
    image: dpage/pgadmin4
    container_name: pgadmin4_container
    environment:
      PGADMIN_DEFAULT_EMAIL: admin@admin.com
      PGADMIN_DEFAULT_PASSWORD: admin
    ports:
      - "89:80"
    networks:
      - postgres-network

  postgres:  #
    image: postgres:10
    container_name: postgres_container
    environment:
      POSTGRES_PASSWORD: 1234  # Senha do banco de dados PostgreSQL
    ports:
      - "5432:5432"  # Mapeando porta 5432 do container para 5432 no host
    volumes:
      - /home/seu_usuario/data/postgres:/var/lib/postgresql/data  # Volume para persistência de dados
    networks:
      - postgres-network

networks:
  postgres-network:
    driver: bridge




