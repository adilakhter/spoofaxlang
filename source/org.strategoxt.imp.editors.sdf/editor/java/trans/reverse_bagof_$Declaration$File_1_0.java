package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class reverse_bagof_$Declaration$File_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Declaration$File_1_0 instance = new reverse_bagof_$Declaration$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_92101)
  { 
    context.push("reverse_bagof_DeclarationFile_1_0");
    Fail76262:
    { 
      TermReference s_92101 = new TermReference();
      TermReference t_92101 = new TermReference();
      if(t_92101.value == null)
        t_92101.value = term;
      else
        if(t_92101.value != term && !t_92101.value.match(term))
          break Fail76262;
      if(s_92101.value == null)
        s_92101.value = term;
      else
        if(s_92101.value != term && !s_92101.value.match(term))
          break Fail76262;
      Success41846:
      { 
        Fail76263:
        { 
          IStrategoTerm y_92101 = null;
          y_92101 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, y_92101, trans.const15524, t_92101.value);
          if(term == null)
            break Fail76263;
          if(true)
            break Success41846;
        }
        term = trans.constNil11;
      }
      lifted21638 lifted216380 = new lifted21638();
      lifted216380.s_92101 = s_92101;
      lifted216380.t_92101 = t_92101;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted216380, v_92101);
      if(term == null)
        break Fail76262;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}