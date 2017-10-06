---
layout: page
title: Documentação / CNPJ
---

### Documentação dos serviços para o CNPJ

Para o serviço de **CNPJ** temos o serviço de busca e validação, onde ao informar um **CNPJ** o serviço irá lhe retornar as informações e/ou validações do mesmo.

**Para acessar o *web service*, um CNPJ no formato de 14 digítos deve ser fornecido, por exemplo: "61646949000158". Após o CNPJ deve ser informado o tipo de retorno que deve ser "json" e quais suas opções que devem ser: "simple", "upper" ou "simple/upper".**

URL base do **CEP**:
```http
http://ws.matheuscastiglioni.com.br/ws/document/cnpj
```

<br/>

### Buscando informações de um CNPJ
```http
http://ws.matheuscastiglioni.com.br/ws/document/cnpj/information/61646949000158/json
```

#### Resposta
```JSON
{"formatado":"61.646.949/0001-58","desformatado":"61646949000158","primeiroDigito":5,"segundoDigito":8,"valido":true}
```

<br/>
<br/>

### Buscando dados de um CNPJ
```http
http://ws.matheuscastiglioni.com.br/ws/document/cnpj/data/61646949000158/json
```

#### Resposta
```JSON
{"cnpj":"61.646.949/0001-58","nomefantasia":"Atena Informatica ","razaosocial":"Atena Informatica Ltda - Epp ","endereco":{"codibge":3530706,"codestado":35,"cep":"13843-191","logradouro":"Rua Itatiba","complemento":"","bairro":"Jardim Itacolomi","cidade":"Mogi Guaçu","estado":"SP"}}
```

<br/>
<br/>

### Buscando dados de um CNPJ sem acento
```http
http://ws.matheuscastiglioni.com.br/ws/document/cnpj/data/61646949000158/json/simple
```

#### Resposta
```JSON
{"cnpj":"61646949000158","nomefantasia":"Atena Informatica ","razaosocial":"Atena Informatica Ltda Epp ","endereco":{"codibge":3530706,"codestado":35,"cep":"13843-191","logradouro":"Rua Itatiba","complemento":"","bairro":"Jardim Itacolomi","cidade":"Mogi Guacu","estado":"SP"}}
```

<br/>
<br/>

### Buscando dados de um CNPJ com letras maisuculas
```http
http://ws.matheuscastiglioni.com.br/ws/document/cnpj/data/61646949000158/json/upper
```

#### Resposta
```JSON
{"cnpj":"61.646.949/0001-58","nomefantasia":"ATENA INFORMATICA","razaosocial":"ATENA INFORMATICA LTDA - EPP","endereco":{"codibge":3530706,"codestado":35,"cep":"13843-191","logradouro":"RUA ITATIBA","complemento":"","bairro":"JARDIM ITACOLOMI","cidade":"MOGI GUAÇU","estado":"SP"}}
```

<br/>
<br/>

### Buscando dados de um CNPJ sem acentos e com letras maisuculas
```http
http://ws.matheuscastiglioni.com.br/ws/document/cnpj/data/61646949000158/json/simple/upper
```

#### Resposta
```JSON
{"cnpj":"61646949000158","nomefantasia":"ATENA INFORMATICA","razaosocial":"ATENA INFORMATICA LTDA EPP","endereco":{"codibge":3530706,"codestado":35,"cep":"13843-191","logradouro":"RUA ITATIBA","complemento":"","bairro":"JARDIM ITACOLOMI","cidade":"MOGI GUACU","estado":"SP"}}
```