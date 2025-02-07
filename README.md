# workshop-log
Repositório com projeto usado no workshop sobre log

# Jenkins
iniciar build via rest
gerar token nas configurações de usário
Via postman:
http://localhost:8081/job/olaMundo/build?token=117272b0aa4477893c2acd288689feef12

🔹 Autenticação

    No Postman, vá para a aba "Authorization" e escolha Basic Auth.
    No campo "Username", use seu usuário do Jenkins.
    No campo "Password", use o token de API gerado (não a senha do usuário!).

🔹 Headers

Adicione um header para evitar problemas com CSRF:
Key:  Content-Type
Value: application/json
