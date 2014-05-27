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

@SuppressWarnings("all") public class reverse_bagof_$Source$Dir_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Source$Dir_1_0 instance = new reverse_bagof_$Source$Dir_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_4845)
  { 
    context.push("reverse_bagof_SourceDir_1_0");
    Fail23473:
    { 
      TermReference b_4845 = new TermReference();
      if(b_4845.value == null)
        b_4845.value = term;
      else
        if(b_4845.value != term && !b_4845.value.match(term))
          break Fail23473;
      Success12599:
      { 
        Fail23474:
        { 
          IStrategoTerm f_4845 = null;
          IStrategoTerm h_4845 = null;
          IStrategoTerm i_4845 = null;
          h_4845 = term;
          f_4845 = trans.const4552;
          i_4845 = h_4845;
          term = dr_lookup_rule_0_2.instance.invoke(context, i_4845, f_4845, trans.constCons2047);
          if(term == null)
            break Fail23474;
          if(true)
            break Success12599;
        }
        term = trans.constNil4;
      }
      lifted7000 lifted70000 = new lifted7000();
      lifted70000.b_4845 = b_4845;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted70000, d_4845);
      if(term == null)
        break Fail23473;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}