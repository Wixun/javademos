public static String seslisil(String x){
        String sesli="AaEeOoUuIi";
        String yenis=" ";
        boolean var=false;
        for (int i = 0; i < x.length(); i++) {
            var=false;
            for (int j = 0; j < sesli.length(); j++) {
              
                if(x.charAt(i)==sesli.charAt(j)){
                    var=true;
                }
                
            }
            if(var!=true){
                yenis+=x.charAt(i);
            }
            
        }
        return yenis;
    }
    
    public static void main(String[] args) {
        System.out.println(seslisil("bilgisayAr muhendisligi "));     
        }
     }
