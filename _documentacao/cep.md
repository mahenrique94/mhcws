---
layout: page
title: Documentação / CEP
---

### Documentação dos serviços para o CEP

Para o serviço de **CEP** temos o serviço de busca, onde ao informar um **CEP** o serviço irá lhe retornar as informações do mesmo.

**Para acessar o *web service*, um CEP no formato de 8 digítos deve ser fornecido, por exemplo: "13845373". Após o CEP deve ser informado o tipo de retorno que deve ser "json" e quais suas opções que devem ser: "simple", "upper" ou "simple/upper".**

URL base do **CNPJ**:
```http
http://ws.matheuscastiglioni.com.br/ws/cep/find
```

<br/>

### Buscando um CEP
```http
http://ws.matheuscastiglioni.com.br/ws/cep/find/13845373/json
```

#### Resposta
```JSON
{"codibge":3530706,"codestado":35,"cep":"13845-373","logradouro":"Rua Caiapós","complemento":"","bairro":"Jardim Igaçaba","cidade":"Mogi Guaçu","estado":"SP"}
```

<br/>
<br/>

### Buscando um CEP sem acentos
```http
http://ws.matheuscastiglioni.com.br/ws/cep/find/13845373/json/simple
```

#### Resposta
```JSON
{"codibge":3530706,"codestado":35,"cep":"13845-373","logradouro":"Rua Caiapos","complemento":"","bairro":"Jardim Igacaba","cidade":"Mogi Guacu","estado":"SP"}
```

<br/>
<br/>

### Buscando um CEP com letras maisuculas
```text
http://ws.matheuscastiglioni.com.br/ws/cep/find/13845373/json/upper
```

#### Resposta
```JSON
{"codibge":3530706,"codestado":35,"cep":"13845-373","logradouro":"RUA CAIAPÓS","complemento":"","bairro":"JARDIM IGAÇABA","cidade":"MOGI GUAÇU","estado":"SP"}
```

<br/>
<br/>

### Buscando um CEP sem acentos e com letras maisuculas
```text
http://ws.matheuscastiglioni.com.br/ws/cep/find/13845373/json/simple/upper
```

#### Resposta
```JSON
{"codibge":3530706,"codestado":35,"cep":"13845-373","logradouro":"RUA CAIAPOS","complemento":"","bairro":"JARDIM IGACABA","cidade":"MOGI GUACU","estado":"SP"}
```