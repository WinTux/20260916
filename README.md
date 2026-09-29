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

Para ejecutar el *.jar desacargado del Release debemos agregar variables de entorno:
### Linux y macOS

```bash
export DB_PASSWORD="mi_password"
export NOMBRE_USR="Ana"
```
### Windows (CMD)
```bash
set DB_PASSWORD=mi_password
set NOMBRE_USR=Ana
```

### Ejecución
```bash
java -jar ejemplo02-0.0.1-SNAPSHOT.jar
```