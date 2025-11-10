public interface ReportVisitor<R> {
    R visit(FixedPriceContract contract);
    R visit(TimeAndMaterialContract contract);
    R visit(SupportContract contract);
}
