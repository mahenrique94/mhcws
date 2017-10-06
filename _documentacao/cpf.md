---
layout: page
title: Documentação / CPF
---

### Documentação dos serviços para o CPF

Para o serviço de **CPF** temos o serviço de validação, onde ao informar um **CPF** o serviço irá lhe retornar as validações do mesmo.

**Para acessar o *web service*, um CPF no formato de 11 digítos deve ser fornecido, por exemplo: "36787219822". Após o CPF deve ser informado o tipo de retorno que deve ser "json".**

URL base do **CPF**:
```http
http://ws.matheuscastiglioni.com.br/ws/document/cpf/
```

<br/>

### Buscando informações de um CPF
```http
http://ws.matheuscastiglioni.com.br/ws/document/cpf/information/36787219822/json
```

#### Resposta
```JSON
{"formatado":"367.872.198-22","desformatado":"36787219822","primeiroDigito":2,"segundoDigito":2,"valido":true}
```