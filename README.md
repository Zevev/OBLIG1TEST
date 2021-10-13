# OBLIG3
La til github bruker i intellij i version control under preferences. Måtte bruke token for å kunne legge til bruker.

Gikk på VCS meny -> import into version control -> share project on github. For å lage repository på github og legge inn prosjektet.

Gikk på tabben Actions i github og lagde en ny workflow.

Etter litt googling fant en template for en workflow .yml fil og jobbet/googlet utifra den

Siden jeg bruker gradele måtte legge til testactions tipset som sto i oppgaven

Etter litt forandringer og teset med workflow, ser at workflow runs viser at tester er passed

Kan åpne Run tests tasken hvis man er logget inn i github og se dette.

Leap_Year_Test > Is_Leap_Year() PASSED

Leap_Year_Test > Year_Dividable_By_100_But_Not_400_Should_Not_Be_A_Leap_Year() PASSED
