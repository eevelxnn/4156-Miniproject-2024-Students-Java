I used pmd for static bug finder. 

To set pmd:
cd $HOME
curl -OL https://github.com/pmd/pmd/releases/download/pmd_releases%2F7.5.0/pmd-dist-7.5.0-bin.zip
unzip pmd-dist-7.5.0-bin.zip
alias pmd="$HOME/pmd-bin-7.5.0/bin/pmd"

cd path/to/IndividualProject

pmd check -d src -R rulesets/java/quickstart.xml -f text


Bug tester command to analyze: pmd check -d src/ -R rulesets/java/quickstart.xml -f text