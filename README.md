# Mindfit

   ![Logotipo do Mindfit](app/src/main/res/drawable/logo_mindfit.png)

   **Mindfit** é um aplicativo Android desenvolvido para promover a saúde física e mental e o bem-estar na Sociedade 5.0. O projeto inclui uma tela de introdução (Splash Screen) e uma tela de login com suporte a autenticação via e-mail/senha e login social (Google e Facebook, em desenvolvimento).


   ## Tecnologias Utilizadas
   - **Linguagem**: Kotlin
   - **IDE**: Android Studio
   - **Layout**: ConstraintLayout e Material Design Components
   - **Versionamento**: Git e GitHub

   ## Como Executar o Projeto
   ### Pré-requisitos
   - Android Studio instalado (versão mais recente recomendada).
   - Dispositivo Android ou emulador configurado.
   - Git instalado.

   ### Passos
   1. Clone o repositório:
      ```bash
      git clone https://github.com/Freitassync/Mindfit.git
      ```
   2. Abra o projeto no Android Studio:
      - Vá para **File > Open** e selecione o diretório clonado.
   3. Sincronize o projeto com Gradle:
      - Clique em **Sync Project with Gradle Files** (ícone de elefante no canto superior direito).
   4. Execute o aplicativo:
      - Conecte um dispositivo Android ou inicie um emulador.
      - Clique em **Run > Run 'app'** (ícone de play verde).

   ## Estrutura do Projeto
   - `app/src/main/res/layout/activity_splash.xml`: Layout da tela de introdução.
   - `app/src/main/res/layout/activity_login.xml`: Layout da tela de login.
   - `app/src/main/java/com/br.com.mindfit/mindfit/SplashActivity.kt`: Lógica da tela de introdução.
   - `app/src/main/java/com/br.com.mindfit/mindfit/LoginActivity.kt`: Lógica da tela de login.
   - `app/src/main/res/drawable/`: Contém o logotipo e ícones sociais (Google e Facebook).

   ## Contribuições
   Contribuições são bem-vindas! Siga os passos abaixo:
   1. Faça um fork do repositório.
   2. Crie uma branch para sua feature (`git checkout -b feature/nova-funcionalidade`).
   3. Faça commit das suas alterações (`git commit -m "Adiciona nova funcionalidade"`).
   4. Envie para o repositório remoto (`git push origin feature/nova-funcionalidade`).
   5. Abra um Pull Request.

   ## Licença
   Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
