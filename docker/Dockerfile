# Use the official PostgreSQL image as the base image
FROM postgres:latest

# Set environment variables
ENV POSTGRES_PORT=5432
ENV POSTGRES_HOST=localhost
ENV POSTGRES_USER=pgdev
ENV POSTGRES_DB=terminal_svc_db
ARG POSTGRES_PASSWORD=""
ENV POSTGRES_PASSWORD=$POSTGRES_PASSWORD

# Expose the PostgreSQL port
EXPOSE 5432