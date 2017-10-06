---
layout: page
title: Documentação / NFE
---

### Documentação dos serviços para o NFE

Para o serviço de **NFE** temos o serviço de informações e validação, onde ao informar um **NFE** o serviço irá lhe retornar as informações e validações do mesmo.

**Para acessar o *web service*, uma CHAVE no formato de 44 digítos deve ser fornecida, por exemplo: "31170626078279000110570010000058541000012504". Após a CHAVE deve ser informado o tipo de retorno que deve ser "json".**

URL base do **NFE**:
```http
http://ws.matheuscastiglioni.com.br/ws/document/eletronic/nfe
```

<br/>

### Buscando informações de um NFE:
```http
http://ws.matheuscastiglioni.com.br/ws/document/eletronic/nfe/information/31170619830872000105550010000056906000057498/json
```

#### Resposta
```JSON
{"valido":true,"estado":"31","mes":6,"ano":17,"cnpj":"19.830.872/0001-05","modelo":55,"serie":1,"numero":5690,"emissao":6,"codigo":5749,"digito":8}
```