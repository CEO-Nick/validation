package second_chapter03_generic;

public class GenericSample {
    public static void main(String[] args) {
        GenericSample sample = new GenericSample();
        sample.checkCastingDTO();
    }

    private void checkCastingDTO() {
        CastingDTO dto1 = new CastingDTO();
        dto1.setObject(new String());

        CastingDTO dto2 = new CastingDTO();
        dto1.setObject(new StringBuffer());

        CastingDTO dto3 = new CastingDTO();
        dto1.setObject(new StringBuilder());

        String tmp1 = (String)dto1.getObject();
        StringBuffer tmp2 = (StringBuffer) dto2.getObject();
        StringBuilder tmp3 = (StringBuilder)dto3.getObject();
    }

    private void checkGenericDTO() {
        CastingGenericDTO<String> dto1 = new CastingGenericDTO<String>();
        dto1.setObject(new String());

        CastingGenericDTO<StringBuffer> dto2 = new CastingGenericDTO<StringBuffer>();
        dto2.setObject(new StringBuffer());

        CastingGenericDTO<StringBuilder> dto3 = new CastingGenericDTO<StringBuilder>();
        dto3.setObject(new StringBuilder());

        String tmp1 = dto1.getObject();
        StringBuffer tmp2 =  dto2.getObject();
        StringBuilder tmp3 = dto3.getObject();
    }



}
