# Git e GitHub

## Configuração

```bash
git config --global user.name "Seu Nome"
git config --global user.email "email@email.com"
```

## Criando Repositórios

```bash
git init
git clone URL
```

## Estado do Projeto

```bash
git status
git log
git diff
```

## Versionamento

```bash
git add .
git add arquivo
git commit -m "Mensagem"
```

## Branches

```bash
git branch
git checkout branch
git checkout -b nova-branch
git merge branch
```

## GitHub

```bash
git remote -v
git fetch
git pull origin main
git push origin main
```

## Desfazendo alterações

```bash
git restore arquivo
git reset HEAD arquivo
git revert HASH
```

## Boas práticas

- Fazer commits pequenos.
- Escrever mensagens descritivas.
- Atualizar o repositório antes de enviar alterações.
- Nunca enviar `node_modules`.
