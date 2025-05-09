Mindfit



Mindfit é um aplicativo Android desenvolvido para promover a saúde mental e o bem-estar na Sociedade 5.0. O projeto inclui uma tela de introdução (Splash Screen) e uma tela de login com suporte a autenticação via e-mail/senha e login social (Google e Facebook, em desenvolvimento).

Funcionalidades





Tela de Introdução: Exibe o logotipo do Mindfit e a mensagem "Saúde Inteligente na Sociedade 5.0" por 3 segundos antes de redirecionar para a tela de login.



Tela de Login: Permite login com e-mail ou nome de usuário e senha, além de opções de login social (Google e Facebook, em desenvolvimento).



Validação Simples: Verifica se os campos de e-mail e senha estão preenchidos antes de prosseguir.



Design Responsivo: Interface com contêiner arredondado, logotipo e texto de apresentação.

Tecnologias Utilizadas





Linguagem: Kotlin



IDE: Android Studio



Layout: ConstraintLayout e Material Design Components



Versionamento: Git e GitHub

Como Executar o Projeto

Pré-requisitos





Android Studio instalado (versão mais recente recomendada).



Dispositivo Android ou emulador configurado.



Git instalado.

Passos





Clone o repositório:

git clone https://github.com/seu-usuario/Mindfit.git



Abra o projeto no Android Studio:





Vá para File > Open e selecione o diretório clonado.



Sincronize o projeto com Gradle:





Clique em Sync Project with Gradle Files (ícone de elefante no canto superior direito).



Execute o aplicativo:





Conecte um dispositivo Android ou inicie um emulador.



Clique em Run > Run 'app' (ícone de play verde).

Estrutura do Projeto





app/src/main/res/layout/activity_splash.xml: Layout da tela de introdução.



app/src/main/res/layout/activity_login.xml: Layout da tela de login.



app/src/main/java/com/seu-pacote/mindfit/SplashActivity.kt: Lógica da tela de introdução.



app/src/main/java/com/seu-pacote/mindfit/LoginActivity.kt: Lógica da tela de login.



app/src/main/res/drawable/: Contém o logotipo e ícones sociais (Google e Facebook).

Próximos Passos





Implementar autenticação real com Firebase Authentication.



Adicionar funcionalidade de login social com Google e Facebook.



Criar tela de cadastro (Sign Up).



Melhorar a interface com animações e transições.

Contribuições

Contribuições são bem-vindas! Siga os passos abaixo:





Faça um fork do repositório.



Crie uma branch para sua feature (git checkout -b feature/nova-funcionalidade).



Faça commit das suas alterações (git commit -m "Adiciona nova funcionalidade").



Envie para o repositório remoto (git push origin feature/nova-funcionalidade).



Abra um Pull Request.

Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo LICENSE para mais detalhes.

Contato

Desenvolvido por [Seu Nome]. Entre em contato pelo e-mail: seu-email@exemplo.com.
