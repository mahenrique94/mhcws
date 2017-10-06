---
layout: page
title: Instalação
---

### Realizando instalação do [{{ site.title }}](/)

Para começar a utlizar o [{{ site.title }}](/) devemos primeiramente baixar o `.zip` do projeto.

Podemos realizar o *download* do projeto acessando o seguinte link: [{{ site.title }}](https://github.com/mahenrique94/mhcws/archive/master.zip)

Após realizar o *download* acesse a pasta raiz do projeto e mande gerar o `.war`, como o projeto utiliza maven basta realizar o comando abaixo:

```bash
mvn package
```

O `.war` será gerado dentro da pasta **target** localizada também na raiz do projeto, com todos os passos seguidos com sucesso copie o `.war` para algum servidor container(**Tomcat**, **Jetty**, **Undertown**, etc..) que suporte o **Java** e aguarde o projeto subir.

Caso não queira realizar a instalação do projeto, consuma o *web service* online.

Com isso o {{ site.title }} ja deve estar instalado ou pode ser usado em seu projeto com o **web service**, configura a [documentação](/documentacao) para começar a usá-lo.