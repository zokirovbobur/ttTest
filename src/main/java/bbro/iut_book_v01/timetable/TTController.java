package bbro.iut_book_v01.timetable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("tt")
public class TTController {
    @GetMapping
    public String strTT(){
        return "<svg style=\"position:absolute;left:0px;top:0px;\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" stroke=\"#000000\" stroke-width=\"0\" fill=\"#000000\" width=\"445.5\" height=\"315\"><defs></defs><g transform=\"scale(0.15)\"><text font-size=\"119.00000000000001\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1485\" y=\"155\">CSE17-13 - BOBUR ZOKIROV</text><text font-size=\"23.752826385260516\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"400.7608695652174\" y=\"335\">9:00-9:30</text><text font-size=\"20.992339188295926\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"400.7608695652174\" y=\"411.5\">9:00 - 9:30</text><line x1=\"456.52173913043475\" y1=\"250\" x2=\"456.52173913043475\" y2=\"420\" stroke-width=\"1\"></line><text font-size=\"20.990192834416607\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"512.2826086956521\" y=\"335\">9:30-10:00</text><text font-size=\"18.80495683337081\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"512.2826086956521\" y=\"411.5\">9:30 - 10:00</text><line x1=\"568.0434782608695\" y1=\"250\" x2=\"568.0434782608695\" y2=\"420\" stroke-width=\"1\"></line><text font-size=\"18.803234316526325\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"623.804347826087\" y=\"335\">10:00-10:30</text><text font-size=\"17.030404421869864\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"623.804347826087\" y=\"411.5\">10:00 - 10:30</text><line x1=\"679.5652173913044\" y1=\"250\" x2=\"679.5652173913044\" y2=\"420\" stroke-width=\"1\"></line><text font-size=\"19.068363129879177\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"735.3260869565217\" y=\"335\">10:30-11:00</text><text font-size=\"17.247606835762856\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"735.3260869565217\" y=\"411.5\">10:30 - 11:00</text><line x1=\"791.0869565217391\" y1=\"250\" x2=\"791.0869565217391\" y2=\"420\" stroke-width=\"1\"></line><text font-size=\"19.341075597091166\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"846.8478260869565\" y=\"335\">11:00-11:30</text><text font-size=\"17.470421135907944\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"846.8478260869565\" y=\"411.5\">11:00 - 11:30</text><line x1=\"902.6086956521739\" y1=\"250\" x2=\"902.6086956521739\" y2=\"420\" stroke-width=\"1\"></line><text font-size=\"19.0683631298792\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"958.3695652173913\" y=\"335\">11:30-12:00</text><text font-size=\"17.247606835762877\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"958.3695652173913\" y=\"411.5\">11:30 - 12:00</text><line x1=\"1014.1304347826087\" y1=\"250\" x2=\"1014.1304347826087\" y2=\"420\" stroke-width=\"1\"></line><text font-size=\"18.803234316526304\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1069.891304347826\" y=\"335\">12:00-12:30</text><text font-size=\"17.030404421869843\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1069.891304347826\" y=\"411.5\">12:00 - 12:30</text><line x1=\"1125.6521739130435\" y1=\"250\" x2=\"1125.6521739130435\" y2=\"420\" stroke-width=\"1\"></line><text font-size=\"18.803234316526304\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1181.413043478261\" y=\"335\">12:30-13:00</text><text font-size=\"17.030404421869843\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1181.413043478261\" y=\"411.5\">12:30 - 13:00</text><line x1=\"1237.1739130434783\" y1=\"250\" x2=\"1237.1739130434783\" y2=\"420\" stroke-width=\"1\"></line><text font-size=\"18.803234316526304\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1292.9347826086955\" y=\"335\">13:00-13:30</text><text font-size=\"17.030404421869843\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1292.9347826086955\" y=\"411.5\">13:00 - 13:30</text><line x1=\"1348.695652173913\" y1=\"250\" x2=\"1348.695652173913\" y2=\"420\" stroke-width=\"1\"></line><text font-size=\"18.803234316526304\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1404.4565217391305\" y=\"335\">13:30-14:00</text><text font-size=\"17.030404421869843\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1404.4565217391305\" y=\"411.5\">13:30 - 14:00</text><line x1=\"1460.2173913043478\" y1=\"250\" x2=\"1460.2173913043478\" y2=\"420\" stroke-width=\"1\"></line><text font-size=\"18.803234316526304\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1515.978260869565\" y=\"335\">14:00-14:30</text><text font-size=\"17.030404421869843\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1515.978260869565\" y=\"411.5\">14:00 - 14:30</text><line x1=\"1571.7391304347825\" y1=\"250\" x2=\"1571.7391304347825\" y2=\"420\" stroke-width=\"1\"></line><text font-size=\"18.80323431652635\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1627.5\" y=\"335\">14:30-15:00</text><text font-size=\"17.030404421869882\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1627.5\" y=\"411.5\">14:30 - 15:00</text><line x1=\"1683.2608695652175\" y1=\"250\" x2=\"1683.2608695652175\" y2=\"420\" stroke-width=\"1\"></line><text font-size=\"18.803234316526304\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1739.021739130435\" y=\"335\">15:00-15:30</text><text font-size=\"17.030404421869843\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1739.021739130435\" y=\"411.5\">15:00 - 15:30</text><line x1=\"1794.7826086956522\" y1=\"250\" x2=\"1794.7826086956522\" y2=\"420\" stroke-width=\"1\"></line><text font-size=\"18.803234316526304\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1850.5434782608695\" y=\"335\">15:30-16:00</text><text font-size=\"17.030404421869843\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1850.5434782608695\" y=\"411.5\">15:30 - 16:00</text><line x1=\"1906.304347826087\" y1=\"250\" x2=\"1906.304347826087\" y2=\"420\" stroke-width=\"1\"></line><text font-size=\"18.803234316526304\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1962.0652173913045\" y=\"335\">16:00-16:30</text><text font-size=\"17.030404421869843\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1962.0652173913045\" y=\"411.5\">16:00 - 16:30</text><line x1=\"2017.8260869565217\" y1=\"250\" x2=\"2017.8260869565217\" y2=\"420\" stroke-width=\"1\"></line><text font-size=\"18.80323431652635\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2073.586956521739\" y=\"335\">16:30-17:00</text><text font-size=\"17.030404421869882\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2073.586956521739\" y=\"411.5\">16:30 - 17:00</text><line x1=\"2129.3478260869565\" y1=\"250\" x2=\"2129.3478260869565\" y2=\"420\" stroke-width=\"1\"></line><text font-size=\"18.80323431652635\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2185.108695652174\" y=\"335\">17:00-17:30</text><text font-size=\"17.030404421869882\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2185.108695652174\" y=\"411.5\">17:00 - 18:00</text><line x1=\"2240.869565217391\" y1=\"250\" x2=\"2240.869565217391\" y2=\"420\" stroke-width=\"1\"></line><text font-size=\"18.80323431652626\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2296.6304347826085\" y=\"335\">17:30-18:00</text><text font-size=\"17.030404421869804\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2296.6304347826085\" y=\"411.5\">17:30 - 18:00</text><line x1=\"2352.391304347826\" y1=\"250\" x2=\"2352.391304347826\" y2=\"420\" stroke-width=\"1\"></line><text font-size=\"18.80323431652626\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2408.1521739130435\" y=\"335\">18:00-18:30</text><text font-size=\"17.030404421869804\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2408.1521739130435\" y=\"411.5\">18:00 - 18:30</text><line x1=\"2463.913043478261\" y1=\"250\" x2=\"2463.913043478261\" y2=\"420\" stroke-width=\"1\"></line><text font-size=\"18.80323431652635\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2519.673913043478\" y=\"335\">18:30-19:00</text><text font-size=\"17.030404421869882\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2519.673913043478\" y=\"411.5\">18:30 - 19:00</text><line x1=\"2575.4347826086955\" y1=\"250\" x2=\"2575.4347826086955\" y2=\"420\" stroke-width=\"1\"></line><text font-size=\"18.803234316526435\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2631.195652173913\" y=\"335\">19:00-19:30</text><text font-size=\"17.03040442186996\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2631.195652173913\" y=\"411.5\">19:00 - 19:30</text><line x1=\"2686.9565217391305\" y1=\"250\" x2=\"2686.9565217391305\" y2=\"420\" stroke-width=\"1\"></line><text font-size=\"18.80323431652635\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2742.717391304348\" y=\"335\">19:30-20:00</text><text font-size=\"17.030404421869882\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2742.717391304348\" y=\"411.5\">19:30 - 20:00</text><line x1=\"2798.478260869565\" y1=\"250\" x2=\"2798.478260869565\" y2=\"420\" stroke-width=\"1\"></line><text font-size=\"18.80323431652626\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2854.2391304347825\" y=\"335\">20:00-20:30</text><text font-size=\"17.030404421869804\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2854.2391304347825\" y=\"411.5\">20:00 - 20:30</text><line x1=\"456.52173913043475\" y1=\"420\" x2=\"456.52173913043475\" y2=\"1950\" stroke-width=\"1\"></line><line x1=\"568.0434782608695\" y1=\"420\" x2=\"568.0434782608695\" y2=\"1950\" stroke-width=\"1\"></line><line x1=\"679.5652173913044\" y1=\"420\" x2=\"679.5652173913044\" y2=\"1950\" stroke-width=\"1\"></line><line x1=\"791.0869565217391\" y1=\"420\" x2=\"791.0869565217391\" y2=\"1950\" stroke-width=\"1\"></line><line x1=\"902.6086956521739\" y1=\"420\" x2=\"902.6086956521739\" y2=\"1950\" stroke-width=\"1\"></line><line x1=\"1014.1304347826087\" y1=\"420\" x2=\"1014.1304347826087\" y2=\"1950\" stroke-width=\"1\"></line><line x1=\"1125.6521739130435\" y1=\"420\" x2=\"1125.6521739130435\" y2=\"1950\" stroke-width=\"1\"></line><line x1=\"1237.1739130434783\" y1=\"420\" x2=\"1237.1739130434783\" y2=\"1950\" stroke-width=\"1\"></line><line x1=\"1348.695652173913\" y1=\"420\" x2=\"1348.695652173913\" y2=\"1950\" stroke-width=\"1\"></line><line x1=\"1460.2173913043478\" y1=\"420\" x2=\"1460.2173913043478\" y2=\"1950\" stroke-width=\"1\"></line><line x1=\"1571.7391304347825\" y1=\"420\" x2=\"1571.7391304347825\" y2=\"1950\" stroke-width=\"1\"></line><line x1=\"1683.2608695652175\" y1=\"420\" x2=\"1683.2608695652175\" y2=\"1950\" stroke-width=\"1\"></line><line x1=\"1794.7826086956522\" y1=\"420\" x2=\"1794.7826086956522\" y2=\"1950\" stroke-width=\"1\"></line><line x1=\"1906.304347826087\" y1=\"420\" x2=\"1906.304347826087\" y2=\"1950\" stroke-width=\"1\"></line><line x1=\"2017.8260869565217\" y1=\"420\" x2=\"2017.8260869565217\" y2=\"1950\" stroke-width=\"1\"></line><line x1=\"2129.3478260869565\" y1=\"420\" x2=\"2129.3478260869565\" y2=\"1950\" stroke-width=\"1\"></line><line x1=\"2240.869565217391\" y1=\"420\" x2=\"2240.869565217391\" y2=\"1950\" stroke-width=\"1\"></line><line x1=\"2352.391304347826\" y1=\"420\" x2=\"2352.391304347826\" y2=\"1950\" stroke-width=\"1\"></line><line x1=\"2463.913043478261\" y1=\"420\" x2=\"2463.913043478261\" y2=\"1950\" stroke-width=\"1\"></line><line x1=\"2575.4347826086955\" y1=\"420\" x2=\"2575.4347826086955\" y2=\"1950\" stroke-width=\"1\"></line><line x1=\"2686.9565217391305\" y1=\"420\" x2=\"2686.9565217391305\" y2=\"1950\" stroke-width=\"1\"></line><line x1=\"2798.478260869565\" y1=\"420\" x2=\"2798.478260869565\" y2=\"1950\" stroke-width=\"1\"></line><text font-size=\"122.4\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"202.5\" y=\"573\">Mo</text><line x1=\"60\" y1=\"726\" x2=\"345\" y2=\"726\" stroke-width=\"1\"></line><text font-size=\"122.4\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"202.5\" y=\"879\">Tu</text><line x1=\"60\" y1=\"1032\" x2=\"345\" y2=\"1032\" stroke-width=\"1\"></line><text font-size=\"122.4\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"202.5\" y=\"1185\">We</text><line x1=\"60\" y1=\"1338\" x2=\"345\" y2=\"1338\" stroke-width=\"1\"></line><text font-size=\"122.4\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"202.5\" y=\"1491\">Th</text><line x1=\"60\" y1=\"1644\" x2=\"345\" y2=\"1644\" stroke-width=\"1\"></line><text font-size=\"122.4\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"202.5\" y=\"1797\">Fr</text><line x1=\"345\" y1=\"726\" x2=\"2910\" y2=\"726\" stroke-width=\"1\"></line><line x1=\"345\" y1=\"1032\" x2=\"2910\" y2=\"1032\" stroke-width=\"1\"></line><line x1=\"345\" y1=\"1338\" x2=\"2910\" y2=\"1338\" stroke-width=\"1\"></line><line x1=\"345\" y1=\"1644\" x2=\"2910\" y2=\"1644\" stroke-width=\"1\"></line><rect x=\"679.5652173913044\" y=\"420\" width=\"334.5652173913044\" height=\"306\" style=\"fill:#fff\" stroke=\"none\"><title>Circuit and Lab (4)\n" +
                "Chongkoo An\n" +
                "202(80)</title></rect><text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"846.8478260869565\" y=\"573\">CaL4</text><text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"696.2934782608696\" y=\"710.7\">CA</text><text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"997.4021739130435\" y=\"710.7\">202(80)</text><line x1=\"679.5652173913044\" y1=\"420\" x2=\"1014.1304347826087\" y2=\"420\" stroke-width=\"1\"></line><line x1=\"679.5652173913044\" y1=\"726\" x2=\"1014.1304347826087\" y2=\"726\" stroke-width=\"1\"></line><line x1=\"679.5652173913044\" y1=\"420\" x2=\"679.5652173913044\" y2=\"726\" stroke-width=\"1\"></line><line x1=\"1014.1304347826087\" y1=\"420\" x2=\"1014.1304347826087\" y2=\"726\" stroke-width=\"1\"></line><rect x=\"345\" y=\"420\" width=\"334.5652173913044\" height=\"306\" style=\"fill:#fff\" stroke=\"none\"><title>Engineering Mathematics (5)\n" +
                "Rustam Turdibayev\n" +
                "B210(80)</title></rect><text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"512.2826086956522\" y=\"573\">EM5</text><text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"361.72826086956525\" y=\"710.7\">RT</text><text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"662.8369565217391\" y=\"710.7\">B210(80)</text><line x1=\"345\" y1=\"420\" x2=\"679.5652173913044\" y2=\"420\" stroke-width=\"1\"></line><line x1=\"345\" y1=\"726\" x2=\"679.5652173913044\" y2=\"726\" stroke-width=\"1\"></line><line x1=\"345\" y1=\"420\" x2=\"345\" y2=\"726\" stroke-width=\"1\"></line><line x1=\"679.5652173913044\" y1=\"420\" x2=\"679.5652173913044\" y2=\"726\" stroke-width=\"1\"></line><rect x=\"1125.6521739130435\" y=\"420\" width=\"334.5652173913045\" height=\"306\" style=\"fill:#fff\" stroke=\"none\"><title>Internet Programming(for CSE) (3)\n" +
                "Sarvar Abdullayev\n" +
                "B202(80)</title></rect><text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" y=\"533.22\"><tspan x=\"1292.9347826086957\">IP(CSE)</tspan><tspan dy=\"79.56\" x=\"1292.9347826086957\">3</tspan></text><text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1142.3804347826087\" y=\"710.7\">SA</text><text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1443.4891304347827\" y=\"710.7\">B202(80)</text><line x1=\"1125.6521739130435\" y1=\"420\" x2=\"1460.217391304348\" y2=\"420\" stroke-width=\"1\"></line><line x1=\"1125.6521739130435\" y1=\"726\" x2=\"1460.217391304348\" y2=\"726\" stroke-width=\"1\"></line><line x1=\"1125.6521739130435\" y1=\"420\" x2=\"1125.6521739130435\" y2=\"726\" stroke-width=\"1\"></line><line x1=\"1460.217391304348\" y1=\"420\" x2=\"1460.217391304348\" y2=\"726\" stroke-width=\"1\"></line><rect x=\"1571.7391304347825\" y=\"420\" width=\"334.5652173913045\" height=\"306\" style=\"fill:#fff\" stroke=\"none\"><title>Computer Architecture (4)\n" +
                "Andrey Dragunov\n" +
                "202(80)</title></rect><text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1739.0217391304348\" y=\"573\">CA4</text><text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1588.4673913043478\" y=\"710.7\">AD</text><text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1889.5760869565217\" y=\"710.7\">202(80)</text><line x1=\"1571.7391304347825\" y1=\"420\" x2=\"1906.304347826087\" y2=\"420\" stroke-width=\"1\"></line><line x1=\"1571.7391304347825\" y1=\"726\" x2=\"1906.304347826087\" y2=\"726\" stroke-width=\"1\"></line><line x1=\"1571.7391304347825\" y1=\"420\" x2=\"1571.7391304347825\" y2=\"726\" stroke-width=\"1\"></line><line x1=\"1906.304347826087\" y1=\"420\" x2=\"1906.304347826087\" y2=\"726\" stroke-width=\"1\"></line><rect x=\"679.5652173913044\" y=\"726\" width=\"334.5652173913044\" height=\"306\" style=\"fill:#fff\" stroke=\"none\"><title>System Programming (4)\n" +
                "Abdul Rakheem Naseer\n" +
                "203(90)</title></rect><text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"846.8478260869565\" y=\"879\">SP4</text><text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"696.2934782608696\" y=\"1016.7\">ARN</text><text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"997.4021739130435\" y=\"1016.7\">203(90)</text><line x1=\"679.5652173913044\" y1=\"726\" x2=\"1014.1304347826087\" y2=\"726\" stroke-width=\"1\"></line><line x1=\"679.5652173913044\" y1=\"1032\" x2=\"1014.1304347826087\" y2=\"1032\" stroke-width=\"1\"></line><line x1=\"679.5652173913044\" y1=\"726\" x2=\"679.5652173913044\" y2=\"1032\" stroke-width=\"1\"></line><line x1=\"1014.1304347826087\" y1=\"726\" x2=\"1014.1304347826087\" y2=\"1032\" stroke-width=\"1\"></line><rect x=\"345\" y=\"726\" width=\"334.5652173913044\" height=\"306\" style=\"fill:#fff\" stroke=\"none\"><title>Computer Architecture (4)\n" +
                "Andrey Dragunov\n" +
                "B202(80)</title></rect><text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"512.2826086956522\" y=\"879\">CA4</text><text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"361.72826086956525\" y=\"1016.7\">AD</text><text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"662.8369565217391\" y=\"1016.7\">B202(80)</text><line x1=\"345\" y1=\"726\" x2=\"679.5652173913044\" y2=\"726\" stroke-width=\"1\"></line><line x1=\"345\" y1=\"1032\" x2=\"679.5652173913044\" y2=\"1032\" stroke-width=\"1\"></line><line x1=\"345\" y1=\"726\" x2=\"345\" y2=\"1032\" stroke-width=\"1\"></line><line x1=\"679.5652173913044\" y1=\"726\" x2=\"679.5652173913044\" y2=\"1032\" stroke-width=\"1\"></line><rect x=\"1125.6521739130435\" y=\"726\" width=\"223.0434782608695\" height=\"306\" style=\"fill:#fff\" stroke=\"none\"><title>Curator Hours (3)\n" +
                "Curator1\n" +
                "B304</title></rect><text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1237.1739130434783\" y=\"879\">CH3</text><text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1136.804347826087\" y=\"1016.7\">C</text><text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1337.5434782608695\" y=\"1016.7\">B304</text><line x1=\"1125.6521739130435\" y1=\"726\" x2=\"1348.695652173913\" y2=\"726\" stroke-width=\"1\"></line><line x1=\"1125.6521739130435\" y1=\"1032\" x2=\"1348.695652173913\" y2=\"1032\" stroke-width=\"1\"></line><line x1=\"1125.6521739130435\" y1=\"726\" x2=\"1125.6521739130435\" y2=\"1032\" stroke-width=\"1\"></line><line x1=\"1348.695652173913\" y1=\"726\" x2=\"1348.695652173913\" y2=\"1032\" stroke-width=\"1\"></line><rect x=\"345\" y=\"1032\" width=\"334.5652173913044\" height=\"306\" style=\"fill:#fff\" stroke=\"none\"><title>Engineering Mathematics (5)\n" +
                "Rustam Turdibayev\n" +
                "B202(80)</title></rect><text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"512.2826086956522\" y=\"1185\">EM5</text><text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"361.72826086956525\" y=\"1322.7\">RT</text><text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"662.8369565217391\" y=\"1322.7\">B202(80)</text><line x1=\"345\" y1=\"1032\" x2=\"679.5652173913044\" y2=\"1032\" stroke-width=\"1\"></line><line x1=\"345\" y1=\"1338\" x2=\"679.5652173913044\" y2=\"1338\" stroke-width=\"1\"></line><line x1=\"345\" y1=\"1032\" x2=\"345\" y2=\"1338\" stroke-width=\"1\"></line><line x1=\"679.5652173913044\" y1=\"1032\" x2=\"679.5652173913044\" y2=\"1338\" stroke-width=\"1\"></line><rect x=\"679.5652173913044\" y=\"1338\" width=\"334.5652173913044\" height=\"306\" style=\"fill:#fff\" stroke=\"none\"><title>System Programming (4)\n" +
                "Abdul Rakheem Naseer\n" +
                "203(90)</title></rect><text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"846.8478260869565\" y=\"1491\">SP4</text><text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"696.2934782608696\" y=\"1628.7\">ARN</text><text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"997.4021739130435\" y=\"1628.7\">203(90)</text><line x1=\"679.5652173913044\" y1=\"1338\" x2=\"1014.1304347826087\" y2=\"1338\" stroke-width=\"1\"></line><line x1=\"679.5652173913044\" y1=\"1644\" x2=\"1014.1304347826087\" y2=\"1644\" stroke-width=\"1\"></line><line x1=\"679.5652173913044\" y1=\"1338\" x2=\"679.5652173913044\" y2=\"1644\" stroke-width=\"1\"></line><line x1=\"1014.1304347826087\" y1=\"1338\" x2=\"1014.1304347826087\" y2=\"1644\" stroke-width=\"1\"></line><rect x=\"2240.869565217391\" y=\"1338\" width=\"334.5652173913045\" height=\"306\" style=\"fill:#fff\" stroke=\"none\"><title>History -1 (4)\n" +
                "Qahramon Yakubov\n" +
                "203(90)</title></rect><text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2408.152173913043\" y=\"1491\">H-4</text><text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2257.597826086956\" y=\"1628.7\">QY</text><text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"2558.7065217391305\" y=\"1628.7\">203(90)</text><line x1=\"2240.869565217391\" y1=\"1338\" x2=\"2575.4347826086955\" y2=\"1338\" stroke-width=\"1\"></line><line x1=\"2240.869565217391\" y1=\"1644\" x2=\"2575.4347826086955\" y2=\"1644\" stroke-width=\"1\"></line><line x1=\"2240.869565217391\" y1=\"1338\" x2=\"2240.869565217391\" y2=\"1644\" stroke-width=\"1\"></line><line x1=\"2575.4347826086955\" y1=\"1338\" x2=\"2575.4347826086955\" y2=\"1644\" stroke-width=\"1\"></line><rect x=\"1014.1304347826087\" y=\"1338\" width=\"334.56521739130426\" height=\"306\" style=\"fill:#fff\" stroke=\"none\"><title>Internet Programming(for CSE) (3)\n" +
                "Sarvar Abdullayev\n" +
                "101 (Comp-40)</title></rect><text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" y=\"1451.22\"><tspan x=\"1181.413043478261\">IP(CSE)</tspan><tspan dy=\"79.56\" x=\"1181.413043478261\">3</tspan></text><text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1030.858695652174\" y=\"1628.7\">SA</text><text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"1331.9673913043478\" y=\"1628.7\">101 (Comp-40)</text><line x1=\"1014.1304347826087\" y1=\"1338\" x2=\"1348.695652173913\" y2=\"1338\" stroke-width=\"1\"></line><line x1=\"1014.1304347826087\" y1=\"1644\" x2=\"1348.695652173913\" y2=\"1644\" stroke-width=\"1\"></line><line x1=\"1014.1304347826087\" y1=\"1338\" x2=\"1014.1304347826087\" y2=\"1644\" stroke-width=\"1\"></line><line x1=\"1348.695652173913\" y1=\"1338\" x2=\"1348.695652173913\" y2=\"1644\" stroke-width=\"1\"></line><rect x=\"345\" y=\"1644\" width=\"334.5652173913044\" height=\"306\" style=\"fill:#fff\" stroke=\"none\"><title>Circuit and Lab (4)\n" +
                "Chongkoo An\n" +
                "202(80)</title></rect><text font-size=\"79.56\" text-rendering=\"geometricPrecision\" text-anchor=\"middle\" dominant-baseline=\"central\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"512.2826086956522\" y=\"1797\">CaL4</text><text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"361.72826086956525\" y=\"1934.7\">CA</text><text font-size=\"30.6\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre; font-family: Arial;\" x=\"662.8369565217391\" y=\"1934.7\">202(80)</text><line x1=\"345\" y1=\"1644\" x2=\"679.5652173913044\" y2=\"1644\" stroke-width=\"1\"></line><line x1=\"345\" y1=\"1950\" x2=\"679.5652173913044\" y2=\"1950\" stroke-width=\"1\"></line><line x1=\"345\" y1=\"1644\" x2=\"345\" y2=\"1950\" stroke-width=\"1\"></line><line x1=\"679.5652173913044\" y1=\"1644\" x2=\"679.5652173913044\" y2=\"1950\" stroke-width=\"1\"></line><line x1=\"60\" y1=\"250\" x2=\"2910\" y2=\"250\" stroke-width=\"3\"></line><line x1=\"2910\" y1=\"250\" x2=\"2910\" y2=\"1950\" stroke-width=\"3\"></line><line x1=\"2910\" y1=\"1950\" x2=\"60\" y2=\"1950\" stroke-width=\"3\"></line><line x1=\"60\" y1=\"1950\" x2=\"60\" y2=\"250\" stroke-width=\"3\"></line><line x1=\"345\" y1=\"250\" x2=\"345\" y2=\"1950\" stroke-width=\"3\"></line><line x1=\"60\" y1=\"420\" x2=\"2910\" y2=\"420\" stroke-width=\"3\"></line><text font-size=\"34\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-after-edge\" style=\"pointer-events: none; white-space: pre;\" x=\"60\" y=\"243.2\">Inha University in Tashkent, 9 Ziyolilar Street Mirzo Ulugbek District</text><text font-size=\"34\" text-rendering=\"geometricPrecision\" text-anchor=\"start\" dominant-baseline=\"text-before-edge\" style=\"pointer-events: none; white-space: pre;\" x=\"60\" y=\"1956.8\">Validity: </text><text font-size=\"34\" text-rendering=\"geometricPrecision\" text-anchor=\"end\" dominant-baseline=\"text-before-edge\" style=\"pointer-events: none; white-space: pre;\" x=\"2910\" y=\"1956.8\">aSc Timetables Online</text></g></svg>";
    }
    @GetMapping("get")
    public String tt(){
        return "\n" +
                "  <svg\n" +
                "    style={{\n" +
                "      position: 'absolute',\n" +
                "      left: 0,\n" +
                "      top: 0,\n" +
                "    }}\n" +
                "    stroke=\"#000\"\n" +
                "    strokeWidth={0}\n" +
                "    width={891}\n" +
                "    height={630}\n" +
                "    {...props}\n" +
                "  >\n" +
                "   \n" +
                "    <text\n" +
                "      fontSize={23.756}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={400.761}\n" +
                "      y={335}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'9:00-9:30'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={20.999}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={400.761}\n" +
                "      y={411.5}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'9:00 - 9:30'}\n" +
                "    </text>\n" +
                "    <path strokeWidth={0.3} d=\"M136.957 75v51\" />\n" +
                "    <text\n" +
                "      fontSize={20.993}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={512.283}\n" +
                "      y={335}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'9:30-10:00'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={18.811}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={512.283}\n" +
                "      y={411.5}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'9:30 - 10:00'}\n" +
                "    </text>\n" +
                "    <path strokeWidth={0.3} d=\"M170.413 75v51\" />\n" +
                "    <text\n" +
                "      fontSize={18.805}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={623.804}\n" +
                "      y={335}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'10:00-10:30'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={17.035}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={623.804}\n" +
                "      y={411.5}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'10:00 - 10:30'}\n" +
                "    </text>\n" +
                "    <path strokeWidth={0.3} d=\"M203.87 75v51\" />\n" +
                "    <text\n" +
                "      fontSize={19.071}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={735.326}\n" +
                "      y={335}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'10:30-11:00'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={17.253}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={735.326}\n" +
                "      y={411.5}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'10:30 - 11:00'}\n" +
                "    </text>\n" +
                "    <path strokeWidth={0.3} d=\"M237.326 75v51\" />\n" +
                "    <text\n" +
                "      fontSize={19.343}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={846.848}\n" +
                "      y={335}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'11:00-11:30'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={17.476}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={846.848}\n" +
                "      y={411.5}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'11:00 - 11:30'}\n" +
                "    </text>\n" +
                "    <path strokeWidth={0.3} d=\"M270.783 75v51\" />\n" +
                "    <text\n" +
                "      fontSize={19.071}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={958.37}\n" +
                "      y={335}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'11:30-12:00'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={17.253}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={958.37}\n" +
                "      y={411.5}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'11:30 - 12:00'}\n" +
                "    </text>\n" +
                "    <path strokeWidth={0.3} d=\"M304.239 75v51\" />\n" +
                "    <text\n" +
                "      fontSize={18.805}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={1069.891}\n" +
                "      y={335}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'12:00-12:30'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={17.035}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={1069.891}\n" +
                "      y={411.5}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'12:00 - 12:30'}\n" +
                "    </text>\n" +
                "    <path strokeWidth={0.3} d=\"M337.696 75v51\" />\n" +
                "    <text\n" +
                "      fontSize={18.805}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={1181.413}\n" +
                "      y={335}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'12:30-13:00'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={17.035}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={1181.413}\n" +
                "      y={411.5}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'12:30 - 13:00'}\n" +
                "    </text>\n" +
                "    <path strokeWidth={0.3} d=\"M371.152 75v51\" />\n" +
                "    <text\n" +
                "      fontSize={18.805}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={1292.935}\n" +
                "      y={335}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'13:00-13:30'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={17.035}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={1292.935}\n" +
                "      y={411.5}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'13:00 - 13:30'}\n" +
                "    </text>\n" +
                "    <path strokeWidth={0.3} d=\"M404.609 75v51\" />\n" +
                "    <text\n" +
                "      fontSize={18.805}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={1404.457}\n" +
                "      y={335}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'13:30-14:00'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={17.035}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={1404.457}\n" +
                "      y={411.5}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'13:30 - 14:00'}\n" +
                "    </text>\n" +
                "    <path strokeWidth={0.3} d=\"M438.065 75v51\" />\n" +
                "    <text\n" +
                "      fontSize={18.805}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={1515.978}\n" +
                "      y={335}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'14:00-14:30'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={17.035}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={1515.978}\n" +
                "      y={411.5}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'14:00 - 14:30'}\n" +
                "    </text>\n" +
                "    <path strokeWidth={0.3} d=\"M471.522 75v51\" />\n" +
                "    <text\n" +
                "      fontSize={18.805}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={1627.5}\n" +
                "      y={335}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'14:30-15:00'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={17.035}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={1627.5}\n" +
                "      y={411.5}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'14:30 - 15:00'}\n" +
                "    </text>\n" +
                "    <path strokeWidth={0.3} d=\"M504.978 75v51\" />\n" +
                "    <text\n" +
                "      fontSize={18.805}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={1739.022}\n" +
                "      y={335}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'15:00-15:30'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={17.035}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={1739.022}\n" +
                "      y={411.5}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'15:00 - 15:30'}\n" +
                "    </text>\n" +
                "    <path strokeWidth={0.3} d=\"M538.435 75v51\" />\n" +
                "    <text\n" +
                "      fontSize={18.805}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={1850.543}\n" +
                "      y={335}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'15:30-16:00'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={17.035}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={1850.543}\n" +
                "      y={411.5}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'15:30 - 16:00'}\n" +
                "    </text>\n" +
                "    <path strokeWidth={0.3} d=\"M571.891 75v51\" />\n" +
                "    <text\n" +
                "      fontSize={18.805}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={1962.065}\n" +
                "      y={335}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'16:00-16:30'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={17.035}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={1962.065}\n" +
                "      y={411.5}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'16:00 - 16:30'}\n" +
                "    </text>\n" +
                "    <path strokeWidth={0.3} d=\"M605.348 75v51\" />\n" +
                "    <text\n" +
                "      fontSize={18.805}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={2073.587}\n" +
                "      y={335}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'16:30-17:00'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={17.035}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={2073.587}\n" +
                "      y={411.5}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'16:30 - 17:00'}\n" +
                "    </text>\n" +
                "    <path strokeWidth={0.3} d=\"M638.804 75v51\" />\n" +
                "    <text\n" +
                "      fontSize={18.805}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={2185.109}\n" +
                "      y={335}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'17:00-17:30'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={17.035}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={2185.109}\n" +
                "      y={411.5}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'17:00 - 18:00'}\n" +
                "    </text>\n" +
                "    <path strokeWidth={0.3} d=\"M672.261 75v51\" />\n" +
                "    <text\n" +
                "      fontSize={18.805}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={2296.63}\n" +
                "      y={335}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'17:30-18:00'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={17.035}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={2296.63}\n" +
                "      y={411.5}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'17:30 - 18:00'}\n" +
                "    </text>\n" +
                "    <path strokeWidth={0.3} d=\"M705.717 75v51\" />\n" +
                "    <text\n" +
                "      fontSize={18.805}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={2408.152}\n" +
                "      y={335}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'18:00-18:30'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={17.035}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={2408.152}\n" +
                "      y={411.5}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'18:00 - 18:30'}\n" +
                "    </text>\n" +
                "    <path strokeWidth={0.3} d=\"M739.174 75v51\" />\n" +
                "    <text\n" +
                "      fontSize={18.805}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={2519.674}\n" +
                "      y={335}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'18:30-19:00'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={17.035}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={2519.674}\n" +
                "      y={411.5}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'18:30 - 19:00'}\n" +
                "    </text>\n" +
                "    <path strokeWidth={0.3} d=\"M772.63 75v51\" />\n" +
                "    <text\n" +
                "      fontSize={18.805}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={2631.196}\n" +
                "      y={335}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'19:00-19:30'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={17.035}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={2631.196}\n" +
                "      y={411.5}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'19:00 - 19:30'}\n" +
                "    </text>\n" +
                "    <path strokeWidth={0.3} d=\"M806.087 75v51\" />\n" +
                "    <text\n" +
                "      fontSize={18.805}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={2742.717}\n" +
                "      y={335}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'19:30-20:00'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={17.035}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={2742.717}\n" +
                "      y={411.5}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'19:30 - 20:00'}\n" +
                "    </text>\n" +
                "    <path strokeWidth={0.3} d=\"M839.543 75v51\" />\n" +
                "    <text\n" +
                "      fontSize={18.805}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={2854.239}\n" +
                "      y={335}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'20:00-20:30'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={17.035}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={2854.239}\n" +
                "      y={411.5}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'20:00 - 20:30'}\n" +
                "    </text>\n" +
                "    <path\n" +
                "      strokeWidth={0.3}\n" +
                "      d=\"M136.957 126v459M170.413 126v459M203.87 126v459M237.326 126v459M270.783 126v459M304.239 126v459M337.696 126v459M371.152 126v459M404.609 126v459M438.065 126v459M471.522 126v459M504.978 126v459M538.435 126v459M571.891 126v459M605.348 126v459M638.804 126v459M672.261 126v459M705.717 126v459M739.174 126v459M772.63 126v459M806.087 126v459M839.543 126v459\"\n" +
                "    />\n" +
                "    <text\n" +
                "      fontSize={122.4}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={202.5}\n" +
                "      y={573}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'Mo'}\n" +
                "    </text>\n" +
                "    <path strokeWidth={0.3} d=\"M18 217.8h85.5\" />\n" +
                "    <text\n" +
                "      fontSize={122.4}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={202.5}\n" +
                "      y={879}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'Tu'}\n" +
                "    </text>\n" +
                "    <path strokeWidth={0.3} d=\"M18 309.6h85.5\" />\n" +
                "    <text\n" +
                "      fontSize={122.4}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={202.5}\n" +
                "      y={1185}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'We'}\n" +
                "    </text>\n" +
                "    <path strokeWidth={0.3} d=\"M18 401.4h85.5\" />\n" +
                "    <text\n" +
                "      fontSize={122.4}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={202.5}\n" +
                "      y={1491}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'Th'}\n" +
                "    </text>\n" +
                "    <path strokeWidth={0.3} d=\"M18 493.2h85.5\" />\n" +
                "    <text\n" +
                "      fontSize={122.4}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={202.5}\n" +
                "      y={1797}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'Fr'}\n" +
                "    </text>\n" +
                "    <path\n" +
                "      strokeWidth={0.3}\n" +
                "      d=\"M103.5 217.8H873M103.5 309.6H873M103.5 401.4H873M103.5 493.2H873\"\n" +
                "    />\n" +
                "    <path stroke=\"none\" fill=\"#fff\" d=\"M103.5 126h100.37v91.8H103.5z\">\n" +
                "      <title>\n" +
                "        {'Object-Oriented Programming 2 (1) Abhijit Tarawade 607(50)'}\n" +
                "      </title>\n" +
                "    </path>\n" +
                "    <text\n" +
                "      fontSize={79.56}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={512.283}\n" +
                "      y={573}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'OOP2-1'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={30.6}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"end\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={662.837}\n" +
                "      y={710.7}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'AT'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={30.6}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={361.728}\n" +
                "      y={710.7}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'607(50)'}\n" +
                "    </text>\n" +
                "    <path\n" +
                "      strokeWidth={0.3}\n" +
                "      d=\"M103.5 126h100.37M103.5 217.8h100.37M103.5 126v91.8M203.87 126v91.8\"\n" +
                "    />\n" +
                "    <path stroke=\"none\" fill=\"#fff\" d=\"M605.348 126h100.37v91.8h-100.37z\">\n" +
                "      <title>\n" +
                "        {'Creative Engineering Design (1) Sarvar Abdullayev B202(80)'}\n" +
                "      </title>\n" +
                "    </path>\n" +
                "    <text\n" +
                "      fontSize={79.56}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={2185.109}\n" +
                "      y={573}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'CED1'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={30.6}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"end\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={2335.663}\n" +
                "      y={710.7}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'SA'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={30.6}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={2034.554}\n" +
                "      y={710.7}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'B202(80)'}\n" +
                "    </text>\n" +
                "    <path\n" +
                "      strokeWidth={0.3}\n" +
                "      d=\"M605.348 126h100.37M605.348 217.8h100.37M605.348 126v91.8M705.717 126v91.8\"\n" +
                "    />\n" +
                "    <path stroke=\"none\" fill=\"#fff\" d=\"M203.87 126h100.369v91.8h-100.37z\">\n" +
                "      <title>{'OOP 2 LAB (1) Abhijit Tarawade B103(50-Comp)'}</title>\n" +
                "    </path>\n" +
                "    <text\n" +
                "      fontSize={79.56}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      y={533.22}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      <tspan x={846.848}>{'OOP2'}</tspan>\n" +
                "      <tspan dy={79.56} x={846.848}>\n" +
                "        {'LAB1'}\n" +
                "      </tspan>\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={30.6}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"end\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={997.402}\n" +
                "      y={710.7}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'AT'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={30.6}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={696.293}\n" +
                "      y={710.7}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'B103(50-Comp)'}\n" +
                "    </text>\n" +
                "    <path\n" +
                "      strokeWidth={0.3}\n" +
                "      d=\"M203.87 126h100.369M203.87 217.8h100.369M203.87 126v91.8M304.239 126v91.8\"\n" +
                "    />\n" +
                "    <path stroke=\"none\" fill=\"#fff\" d=\"M371.152 217.8h133.826v91.8H371.152z\">\n" +
                "      <title>\n" +
                "        {'Physics Experiment 1 (1) Alisher Sanetullayev 201/504(Lap)'}\n" +
                "      </title>\n" +
                "    </path>\n" +
                "    <text\n" +
                "      fontSize={79.56}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={1460.217}\n" +
                "      y={879}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'PE1-1'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={30.6}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"end\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={1660.957}\n" +
                "      y={1016.7}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'AS'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={30.6}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={1259.478}\n" +
                "      y={1016.7}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'201/504(Lap)'}\n" +
                "    </text>\n" +
                "    <path\n" +
                "      strokeWidth={0.3}\n" +
                "      d=\"M371.152 217.8h133.826M371.152 309.6h133.826M371.152 217.8v91.8M504.978 217.8v91.8\"\n" +
                "    />\n" +
                "    <path stroke=\"none\" fill=\"#fff\" d=\"M504.978 217.8h100.37v91.8h-100.37z\">\n" +
                "      <title>\n" +
                "        {'Creative Engineering Design (1) Sarvar Abdullayev B201(80)'}\n" +
                "      </title>\n" +
                "    </path>\n" +
                "    <text\n" +
                "      fontSize={79.56}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={1850.543}\n" +
                "      y={879}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'CED1'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={30.6}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"end\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={2001.098}\n" +
                "      y={1016.7}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'SA'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={30.6}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={1699.989}\n" +
                "      y={1016.7}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'B201(80)'}\n" +
                "    </text>\n" +
                "    <path\n" +
                "      strokeWidth={0.3}\n" +
                "      d=\"M504.978 217.8h100.37M504.978 309.6h100.37M504.978 217.8v91.8M605.348 217.8v91.8\"\n" +
                "    />\n" +
                "    <path stroke=\"none\" fill=\"#fff\" d=\"M605.348 217.8h100.37v91.8h-100.37z\">\n" +
                "      <title>{'Academic English 2 (1) Begmatova Kholida 308(48)'}</title>\n" +
                "    </path>\n" +
                "    <text\n" +
                "      fontSize={79.56}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={2185.109}\n" +
                "      y={879}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'AE2-1'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={30.6}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"end\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={2335.663}\n" +
                "      y={1016.7}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'BK'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={30.6}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={2034.554}\n" +
                "      y={1016.7}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'308(48)'}\n" +
                "    </text>\n" +
                "    <path\n" +
                "      strokeWidth={0.3}\n" +
                "      d=\"M605.348 217.8h100.37M605.348 309.6h100.37M605.348 217.8v91.8M705.717 217.8v91.8\"\n" +
                "    />\n" +
                "    <path stroke=\"none\" fill=\"#fff\" d=\"M103.5 217.8h100.37v91.8H103.5z\">\n" +
                "      <title>{'Physics 1 (1) Alisher Sanetullayev B209(80)'}</title>\n" +
                "    </path>\n" +
                "    <text\n" +
                "      fontSize={79.56}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={512.283}\n" +
                "      y={879}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'P1-1'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={30.6}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"end\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={662.837}\n" +
                "      y={1016.7}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'AS'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={30.6}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={361.728}\n" +
                "      y={1016.7}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'B209(80)'}\n" +
                "    </text>\n" +
                "    <path\n" +
                "      strokeWidth={0.3}\n" +
                "      d=\"M103.5 217.8h100.37M103.5 309.6h100.37M103.5 217.8v91.8M203.87 217.8v91.8\"\n" +
                "    />\n" +
                "    <path stroke=\"none\" fill=\"#fff\" d=\"M103.5 309.6h100.37v91.8H103.5z\">\n" +
                "      <title>{'Physics 1 (1) Alisher Sanetullayev B201(80)'}</title>\n" +
                "    </path>\n" +
                "    <text\n" +
                "      fontSize={79.56}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={512.283}\n" +
                "      y={1185}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'P1-1'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={30.6}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"end\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={662.837}\n" +
                "      y={1322.7}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'AS'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={30.6}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={361.728}\n" +
                "      y={1322.7}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'B201(80)'}\n" +
                "    </text>\n" +
                "    <path\n" +
                "      strokeWidth={0.3}\n" +
                "      d=\"M103.5 309.6h100.37M103.5 401.4h100.37M103.5 309.6v91.8M203.87 309.6v91.8\"\n" +
                "    />\n" +
                "    <path stroke=\"none\" fill=\"#fff\" d=\"M571.891 401.4h100.37v91.8H571.89z\">\n" +
                "      <title>{'Academic English 2 (1) Begmatova Kholida 606(50)'}</title>\n" +
                "    </path>\n" +
                "    <text\n" +
                "      fontSize={79.56}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={2073.587}\n" +
                "      y={1491}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'AE2-1'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={30.6}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"end\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={2224.141}\n" +
                "      y={1628.7}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'BK'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={30.6}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={1923.033}\n" +
                "      y={1628.7}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'606(50)'}\n" +
                "    </text>\n" +
                "    <path\n" +
                "      strokeWidth={0.3}\n" +
                "      d=\"M571.891 401.4h100.37M571.891 493.2h100.37M571.891 401.4v91.8M672.261 401.4v91.8\"\n" +
                "    />\n" +
                "    <path stroke=\"none\" fill=\"#fff\" d=\"M270.783 401.4h133.826v91.8H270.783z\">\n" +
                "      <title>\n" +
                "        {'Technical Writing& Discussion (1) Iroda Saydazimova 513(45)'}\n" +
                "      </title>\n" +
                "    </path>\n" +
                "    <text\n" +
                "      fontSize={79.56}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={1125.652}\n" +
                "      y={1491}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'TWD1'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={30.6}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"end\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={1326.391}\n" +
                "      y={1628.7}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'IS'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={30.6}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={924.913}\n" +
                "      y={1628.7}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'513(45)'}\n" +
                "    </text>\n" +
                "    <path\n" +
                "      strokeWidth={0.3}\n" +
                "      d=\"M270.783 401.4h133.826M270.783 493.2h133.826M270.783 401.4v91.8M404.609 401.4v91.8\"\n" +
                "    />\n" +
                "    <path stroke=\"none\" fill=\"#fff\" d=\"M103.5 401.4h100.37v91.8H103.5z\">\n" +
                "      <title>{'Calculus 2 (1) Dokov Steftcho Pentchev 202(80)'}</title>\n" +
                "    </path>\n" +
                "    <text\n" +
                "      fontSize={79.56}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={512.283}\n" +
                "      y={1491}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'C2-1'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={30.6}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"end\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={662.837}\n" +
                "      y={1628.7}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'DSP'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={30.6}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={361.728}\n" +
                "      y={1628.7}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'202(80)'}\n" +
                "    </text>\n" +
                "    <path\n" +
                "      strokeWidth={0.3}\n" +
                "      d=\"M103.5 401.4h100.37M103.5 493.2h100.37M103.5 401.4v91.8M203.87 401.4v91.8\"\n" +
                "    />\n" +
                "    <path stroke=\"none\" fill=\"#fff\" d=\"M203.87 493.2h66.912V585H203.87z\">\n" +
                "      <title>{'Curator Hours (4) Curator 2 B304'}</title>\n" +
                "    </path>\n" +
                "    <text\n" +
                "      fontSize={79.56}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={791.087}\n" +
                "      y={1797}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'CH4'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={30.6}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"end\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={891.457}\n" +
                "      y={1934.7}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'C'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={30.6}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={690.717}\n" +
                "      y={1934.7}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'B304'}\n" +
                "    </text>\n" +
                "    <path\n" +
                "      strokeWidth={0.3}\n" +
                "      d=\"M203.87 493.2h66.913M203.87 585h66.913M203.87 493.2V585M270.783 493.2V585\"\n" +
                "    />\n" +
                "    <path stroke=\"none\" fill=\"#fff\" d=\"M538.435 493.2h100.37V585h-100.37z\">\n" +
                "      <title>{'Calculus 2 (1) Dokov Steftcho Pentchev B209(80)'}</title>\n" +
                "    </path>\n" +
                "    <text\n" +
                "      fontSize={79.56}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"middle\"\n" +
                "      dominantBaseline=\"central\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={1962.065}\n" +
                "      y={1797}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'C2-1'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={30.6}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      textAnchor=\"end\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={2112.62}\n" +
                "      y={1934.7}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'DSP'}\n" +
                "    </text>\n" +
                "    <text\n" +
                "      fontSize={30.6}\n" +
                "      textRendering=\"geometricPrecision\"\n" +
                "      dominantBaseline=\"text-after-edge\"\n" +
                "      style={{\n" +
                "        whiteSpace: 'pre',\n" +
                "      }}\n" +
                "      x={1811.511}\n" +
                "      y={1934.7}\n" +
                "      pointerEvents=\"none\"\n" +
                "      fontFamily=\"Arial\"\n" +
                "      transform=\"scale(.3)\"\n" +
                "    >\n" +
                "      {'B209(80)'}\n" +
                "    </text>\n" +
                "    <path\n" +
                "      strokeWidth={0.3}\n" +
                "      d=\"M538.435 493.2h100.37M538.435 585h100.37M538.435 493.2V585M638.804 493.2V585\"\n" +
                "    />\n" +
                "    <path\n" +
                "      strokeWidth={0.8999999999999999}\n" +
                "      d=\"M18 75h855M873 75v510M873 585H18M18 585V75M103.5 75v510M18 126h855\"\n" +
                "    />\n" +
                "   \n" +
                "  </svg>\n" +
                "\n";
    }
}
