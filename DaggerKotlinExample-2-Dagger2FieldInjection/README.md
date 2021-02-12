# Dagger 2
Sample example 2 Field Injection. 

# <b> Attaching some screenshots: </b> 
#--------Example 1---------
Constrctor ->@ Component ->@Inject
 val hondaCar = DaggerCarInjector.create().getCar()
# call method using the Constrctor refrence

   # --------Example 2---------
  
    
  Field Injection ->@ Component ->@Inject
 # 1  fun injectFields(mainActivity: MainActivity)
Component  comment create context of interface in MainActvity class
 
 #2 DaggerCarInjector.create().injectFields(this)
 retrive context of Injector class @ Component in MainActvity class
 
# 3@Inject lateinit var hondaCar: Car  
member or field inject in mainactvity  and lateinit private memeber could not be use
# call method using the field refrence
<img src = "screenshots/output.png" width = "250" /> 

