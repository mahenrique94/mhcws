---
layout: page
title: Documentação / MDFE
---

### Documentação dos serviços para o MDFE

Para o serviço de **MDFE** temos o serviço de informações e validação, onde ao informar um **MDFE** o serviço irá lhe retornar as informações e validações do mesmo.

**Para acessar o *web service*, uma CHAVE no formato de 44 digítos deve ser fornecida, por exemplo: "31170626078279000110570010000058541000012504". Após a CHAVE deve ser informado o tipo de retorno que deve ser "json".**

URL base do **MDFE**:
```http
http://ws.matheuscastiglioni.com.br/ws/document/eletronic/mdfe
```

<br/>

### Buscando informações de um MDFE:
```http
http://ws.matheuscastiglioni.com.br/ws/document/eletronic/mdfe/information/31170626706013000174580010000000311000000314/json
```

#### Resposta
```JSON
{"valido":true,"estado":"31","mes":6,"ano":17,"cnpj":"26.706.013/0001-74","modelo":58,"serie":1,"numero":31,"emissao":1,"codigo":31,"digito":4}
```