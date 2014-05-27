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

@SuppressWarnings("all") public class reverse_bagof_$Current$Dir_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Current$Dir_1_0 instance = new reverse_bagof_$Current$Dir_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_4863)
  { 
    context.push("reverse_bagof_CurrentDir_1_0");
    Fail23577:
    { 
      TermReference d_4863 = new TermReference();
      if(d_4863.value == null)
        d_4863.value = term;
      else
        if(d_4863.value != term && !d_4863.value.match(term))
          break Fail23577;
      Success12627:
      { 
        Fail23578:
        { 
          IStrategoTerm h_4863 = null;
          IStrategoTerm j_4863 = null;
          IStrategoTerm k_4863 = null;
          j_4863 = term;
          h_4863 = trans.const4556;
          k_4863 = j_4863;
          term = dr_lookup_rule_0_2.instance.invoke(context, k_4863, h_4863, trans.constCons2047);
          if(term == null)
            break Fail23578;
          if(true)
            break Success12627;
        }
        term = trans.constNil4;
      }
      lifted7036 lifted70360 = new lifted7036();
      lifted70360.d_4863 = d_4863;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted70360, f_4863);
      if(term == null)
        break Fail23577;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}