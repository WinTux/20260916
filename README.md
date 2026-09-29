Se debe crear un par de variables de entorno:
```bash
export DB_PASSWORD="mi_password"
export NOMBRE_USR="Ana"
```

Entonces ejecutar:
```bash
mvn spring-boot:run
```

## Hablemos de Releases

Un push normal se realiza de la siguiente manera
```bash
git add .
git commit -m "Preparando mi primer release"
git push origin main
```

Pero para un Release (para que se ejecute el Workflow de releases) debemos crear un tag
```bash
git tag v1.0.1
git push origin v1.0.1
```
