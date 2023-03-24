class TechCareerTask2 {
    fun convertToFahrenheit(degree :Int):Double{
        return (degree*1.8) + 32
    }

    fun calculateCircum(edge1:Int,edge2: Int):Int{
        return (edge1+edge2)*2
    }
    fun calculateFactorial(num:Int):Int{
        var reValue=1
        for (i in 1..num){
            reValue*=i
        }
        return reValue
    }
    fun findCountLetter(word:String):Int{
        var counter=0
        for (i in word){
            if (i =='a'){
                counter++
            }
        }
        return counter
    }

    fun sumAngle(numOfEdge :Int):Int{
        return (numOfEdge -2 ) *180
    }

    fun calculateSalary(day:Int):Int{
        val workHour=day*8
        val hourlySalary =10
        val overtimeSalary=20


        if(workHour>overtimeSalary){
            return  (workHour*hourlySalary) + ((workHour - 160) * overtimeSalary)
        }else{
            return (workHour*hourlySalary)
        }
    }
    fun calculateFee(quota:Int):Int{
        val fixQuota=50
        val fixPrice=100
        val overQuotaPrice=4


        if(quota<=fixQuota){
            return fixPrice
        }else{
            return fixPrice +  (quota-fixQuota)*overQuotaPrice
        }
    }
}
