package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class reverse_bagof_$Declare$Cookie_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Declare$Cookie_1_0 instance = new reverse_bagof_$Declare$Cookie_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_4899)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("reverse_bagof_DeclareCookie_1_0");
    Fail23647:
    { 
      IStrategoTerm term12789 = term;
      Success12659:
      { 
        Fail23648:
        { 
          TermReference i_4875 = new TermReference();
          TermReference j_4875 = new TermReference();
          if(j_4875.value == null)
            j_4875.value = term;
          else
            if(j_4875.value != term && !j_4875.value.match(term))
              break Fail23648;
          if(i_4875.value == null)
            i_4875.value = term;
          else
            if(i_4875.value != term && !i_4875.value.match(term))
              break Fail23648;
          Success12660:
          { 
            Fail23649:
            { 
              IStrategoTerm o_4875 = null;
              o_4875 = term;
              term = dr_lookup_rule_0_2.instance.invoke(context, o_4875, trans.const4568, j_4875.value);
              if(term == null)
                break Fail23649;
              if(true)
                break Success12660;
            }
            term = trans.constNil4;
          }
          lifted7060 lifted70600 = new lifted7060();
          lifted70600.i_4875 = i_4875;
          lifted70600.j_4875 = j_4875;
          term = reverse_filter_2_0.instance.invoke(context, term, lifted70600, d_4899);
          if(term == null)
            break Fail23648;
          if(true)
            break Success12659;
        }
        term = term12789;
        TermReference z_4874 = new TermReference();
        TermReference a_4875 = new TermReference();
        if(z_4874.value == null)
          z_4874.value = term;
        else
          if(z_4874.value != term && !z_4874.value.match(term))
            break Fail23647;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
          break Fail23647;
        if(a_4875.value == null)
          a_4875.value = term.getSubterm(0);
        else
          if(a_4875.value != term.getSubterm(0) && !a_4875.value.match(term.getSubterm(0)))
            break Fail23647;
        Success12661:
        { 
          Fail23650:
          { 
            IStrategoTerm e_4875 = null;
            IStrategoTerm g_4875 = null;
            IStrategoTerm h_4875 = null;
            g_4875 = term;
            e_4875 = trans.const4568;
            term = g_4875;
            h_4875 = g_4875;
            if(a_4875.value == null)
              break Fail23650;
            term = termFactory.annotateTerm(termFactory.makeTuple(a_4875.value, trans.constCons2047, trans.constCons2047), checkListAnnos(termFactory, trans.constCons2047));
            term = dr_lookup_rule_0_2.instance.invoke(context, h_4875, e_4875, term);
            if(term == null)
              break Fail23650;
            if(true)
              break Success12661;
          }
          term = trans.constNil4;
        }
        lifted7061 lifted70610 = new lifted7061();
        lifted70610.a_4875 = a_4875;
        lifted70610.z_4874 = z_4874;
        term = reverse_filter_2_0.instance.invoke(context, term, lifted70610, d_4899);
        if(term == null)
          break Fail23647;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}