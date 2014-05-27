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

@SuppressWarnings("all") public class reverse_bagof_$Content$Proposals_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Content$Proposals_1_0 instance = new reverse_bagof_$Content$Proposals_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_4893)
  { 
    context.push("reverse_bagof_ContentProposals_1_0");
    Fail23758:
    { 
      TermReference e_4893 = new TermReference();
      if(e_4893.value == null)
        e_4893.value = term;
      else
        if(e_4893.value != term && !e_4893.value.match(term))
          break Fail23758;
      Success12693:
      { 
        Fail23759:
        { 
          IStrategoTerm i_4893 = null;
          IStrategoTerm k_4893 = null;
          IStrategoTerm l_4893 = null;
          k_4893 = term;
          i_4893 = trans.const4611;
          l_4893 = k_4893;
          term = dr_lookup_rule_0_2.instance.invoke(context, l_4893, i_4893, trans.constCons2047);
          if(term == null)
            break Fail23759;
          if(true)
            break Success12693;
        }
        term = trans.constNil4;
      }
      lifted7100 lifted71000 = new lifted7100();
      lifted71000.e_4893 = e_4893;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted71000, g_4893);
      if(term == null)
        break Fail23758;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}