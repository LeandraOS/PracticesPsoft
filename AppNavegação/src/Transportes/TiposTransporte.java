package Transportes;

public enum TiposTransporte {

    CARRO{
        @Override
        public Transportes obterTransporte(){
            return new Carro();
        }
    },
    METRO{
        @Override
        public Transportes obterTransporte(){
            return new Metro();
        }
    },
    ONIBUS {
        @Override

        public Transportes obterTransporte() {
            return new Onibus();
        }
    },
    PEDESTRE{
        @Override
        public Transportes obterTransporte(){
            return new Pedestre();
        }
    };

    public abstract Transportes obterTransporte();
}