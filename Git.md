# windows github

### install/upgrade github cli

command line (cmd)

`winget install --id GitHub.cli`

`winget upgrade --id GitHub.cli`



# git設定

$ git config --global user.name "name"

$ git config --global user.email "email"

$ git config --list OR $ cat ~/.gitconfig

# 新增git資料夾

於資料夾下

$ git init

# 複製git資料夾

$ git clone "URL"

# cmd

$ git status

修改檔案 => 加入 stage (git add) => 提交( git commit )

$ git add

use "git add ..." to include in what will be committed

$ git commit OR $ git commit -m "提交目的"

# 查看變更

$ git log --stat

$ git log -p

$ vim .gitignore 將忽略的目標寫入
