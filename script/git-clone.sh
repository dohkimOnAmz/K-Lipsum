#!/bin/bash
#K-Lipsum Clone
git clone https://github.com/dohkimOnAmz/K-Lipsum.git
cd K-Lipsum/

# config Credential
git config --global credential.helper '!aws codecommit credential-helper $@'
git config --global credential.UseHttpPath true

#Push new repo(Code Commit)
#eg. git remote add new https://git-codecommit.us-west-2.amazonaws.com/v1/repos/commit-builders-klipsum
git remote add new [[Commit-URL]]
git push new master
git remote remove origin
git push --set-upstream new master