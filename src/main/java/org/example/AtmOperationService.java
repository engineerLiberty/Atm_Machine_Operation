package org.example;

public interface AtmOperationService {
    public void viewBalance();
    public void viewBankMiniStatement();
    public void depositAmount(double depositAmount);
    public void withdrawAmount(double withdrawAmount);
}
//echo "# Atm_Machine_Operation" >> README.md
//        git init
//        git add README.md
//        git commit -m "first commit"
//        git branch -M main
//        git remote add origin git@github.com:engineerLiberty/Atm_Machine_Operation.git
//        git push -u origin main