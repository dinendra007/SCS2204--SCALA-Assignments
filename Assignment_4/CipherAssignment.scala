object ceaserCipher extends App{
    
 val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
 val Encrypt=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
 val Decrypt=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key+a.size)%a.size)
 val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))
 val inputText = scala.io.StdIn.readLine("Enter the Secret Message: ")
 val shift = scala.io.StdIn.readLine("Enter no of Shifts: ").toInt
 val encryptMessage=cipher(Encrypt,inputText,shift,alphabet)
 val decryptMessage=cipher(Decrypt,encryptMessage,shift,alphabet)
 println(encryptMessage)
 println(decryptMessage)
}