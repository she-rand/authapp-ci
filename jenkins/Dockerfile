FROM jenkins/jenkins:lts

USER root

RUN apt-get update && apt-get install -y maven

# Opcional: Verificar instalación
RUN mvn -version
