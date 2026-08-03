# 🐧 Administração Básica do Linux Mint

## Navegação

```bash
pwd
ls
ls -l
ls -la
cd pasta
cd ..
cd ~
clear
history
```

## Arquivos e Diretórios

```bash
touch arquivo.txt
mkdir pasta
mkdir -p projeto/src
cp arquivo destino
cp -r pasta1 pasta2
mv origem destino
rm arquivo
rm -r pasta
rm -rf pasta
```

## Visualização de Arquivos

```bash
cat arquivo.txt
less arquivo.txt
head arquivo.txt
tail arquivo.txt
tail -f arquivo.log
```

## Pesquisa

```bash
find . -name "*.js"
grep "texto" arquivo.txt
grep -R "express" .
```

## Permissões

```bash
chmod +x script.sh
chmod 755 arquivo
chown usuario arquivo
```

## Compactação

```bash
zip -r projeto.zip projeto
unzip projeto.zip
tar -czf backup.tar.gz pasta
tar -xzf backup.tar.gz
```

## Monitoramento

```bash
top
htop
ps
kill PID
free -h
df -h
du -sh pasta
```

## Rede

```bash
ping google.com
ip addr
hostname
curl URL
wget URL
```

## Gerenciamento de Pacotes

```bash
sudo apt update
sudo apt upgrade
sudo apt install pacote
sudo apt remove pacote
apt search pacote
```

## Variáveis de Ambiente

```bash
printenv
export PORT=3000
```

## VS Code

```bash
code .
code arquivo.js
```

## Atalhos

| Atalho | Função |
|---------|--------|
| Tab | Autocompletar |
| Ctrl+C | Interromper processo |
| Ctrl+D | Sair |
| Ctrl+L | Limpar terminal |
| Ctrl+R | Buscar histórico |
| ↑ | Último comando |
