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

@SuppressWarnings("all") public class reverse_bagof_$No$Analysis_1_0 extends Strategy 
{ 
  public static reverse_bagof_$No$Analysis_1_0 instance = new reverse_bagof_$No$Analysis_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4858)
  { 
    context.push("reverse_bagof_NoAnalysis_1_0");
    Fail23551:
    { 
      TermReference t_4858 = new TermReference();
      TermReference u_4858 = new TermReference();
      if(u_4858.value == null)
        u_4858.value = term;
      else
        if(u_4858.value != term && !u_4858.value.match(term))
          break Fail23551;
      if(t_4858.value == null)
        t_4858.value = term;
      else
        if(t_4858.value != term && !t_4858.value.match(term))
          break Fail23551;
      Success12620:
      { 
        Fail23552:
        { 
          IStrategoTerm y_4858 = null;
          IStrategoTerm a_4859 = null;
          IStrategoTerm b_4859 = null;
          a_4859 = term;
          y_4858 = trans.const4559;
          b_4859 = a_4859;
          term = dr_lookup_rule_0_2.instance.invoke(context, b_4859, y_4858, trans.constCons2047);
          if(term == null)
            break Fail23552;
          if(true)
            break Success12620;
        }
        term = trans.constNil4;
      }
      lifted7027 lifted70270 = new lifted7027();
      lifted70270.t_4858 = t_4858;
      lifted70270.u_4858 = u_4858;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted70270, w_4858);
      if(term == null)
        break Fail23551;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}