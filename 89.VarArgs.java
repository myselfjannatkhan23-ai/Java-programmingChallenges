class VarArgs {
    public static void main(String[] args) {
        System.out.println(concatenate("Jannat"));
        System.out.println(concatenate("Jannat", "Jain"));
        System.out.println(concatenate("Subscribe"," to", "MyVlog"));
    }

    public static String concatenate(String... strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs) {
            sb.append(str).append(" ");
        }
        return sb.toString();

    }
}
