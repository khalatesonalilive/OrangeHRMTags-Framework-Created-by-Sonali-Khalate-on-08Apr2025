 
 #@EndToEndTesting
 
#Feature: Test OrangeHRM Application
#for OR || operators if any one condition is True then result is True
#for AND && operators if anyone condition is False then result is False


#Regression=True
#SystemTesting=False
#Not SystemTesting=True
#Sanity=False(True||True||False=True)
#@Regression 
#Scenario: Test Regression Scenario
#Given regression scenario Step1
#When regression scenaroio Step2
#Then regression scenario Step3

#Regression=False
#SystemTesting=False
#Not SystemTesting=True
#sanity=True(False||True||True=True)
#@Sanity 
#Scenario: Test Sanity Scenario
#Given Sanity Scenario step1
#When Sanity Scenario step2
#Then Sanity Scenario step3


#Regression=False
#SystemTesting=True
#Not SystemTesting=False
#Sanity=False(False||False||False=False)
#@SystemTesting 
#Scenario: Test SystemTesting Scenario
#Given SystemTesting Scenario Step1
#When SystemTesting Scenario Step2
#Then SystemTesting Scenario Step3


#Regression=False
#SystemTesting=False
#Not SystemTesting=True
#Sanity=False(False||True||False=True)
#@Login 
#Scenario: Test Login Scenario
#Given Login Scenario step1
#When Login Scenario step2
#Then Login Scenario step3




