---
layout: page
title: Documentação / CTE
---

### Documentação dos serviços para o CTE

Para o serviço de **CTE** temos o serviço de informações e validação, onde ao informar um **CTE** o serviço irá lhe retornar as informações e validações do mesmo.

**Para acessar o *web service*, uma CHAVE no formato de 44 digítos deve ser fornecida, por exemplo: "31170626078279000110570010000058541000012504". Após a CHAVE deve ser informado o tipo de retorno que deve ser "json".**

URL base do **CPF**:
```http
http://ws.matheuscastiglioni.com.br/ws/document/eletronic/cte
```

<br/>

### Buscando informações de um CTE:
```http
http://ws.matheuscastiglioni.com.br/ws/document/eletronic/cte/information/31170626078279000110570010000058541000012504/json
```

#### Resposta
```JSON
{"valido":true,"estado":"31","mes":6,"ano":17,"cnpj":"26.078.279/0001-10","modelo":57,"serie":1,"numero":5854,"emissao":1,"codigo":1250,"digito":4}
```