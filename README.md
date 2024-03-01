# Liquibase Tarantool driver prototype

## Build

```
mvn package
```

## Test

```bash
tarantool
```

```lua
box.cfg{listen = 3301}
box.schema.user.create('test', {if_not_exists = true})
box.schema.user.passwd('test', 'test')
box.schema.user.grant('test', 'execute', 'universe', nil, {if_not_exists = true})
```

```bash
mvn exec:java
```

```
2.11.2-0-g1bac2d257b
```
