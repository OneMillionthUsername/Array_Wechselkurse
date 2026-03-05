//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    double[] kurse = {0.8,0.9,0.7,0.6,0.7,0.8,0.5, 0.6};
    Wechselkurs wk = new Wechselkurs(kurse);
    System.out.println(wk.toString());
}

