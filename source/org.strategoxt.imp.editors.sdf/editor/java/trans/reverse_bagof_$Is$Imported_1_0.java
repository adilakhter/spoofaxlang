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

@SuppressWarnings("all") public class reverse_bagof_$Is$Imported_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Is$Imported_1_0 instance = new reverse_bagof_$Is$Imported_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_92084)
  { 
    context.push("reverse_bagof_IsImported_1_0");
    Fail76158:
    { 
      TermReference h_92084 = new TermReference();
      TermReference i_92084 = new TermReference();
      if(i_92084.value == null)
        i_92084.value = term;
      else
        if(i_92084.value != term && !i_92084.value.match(term))
          break Fail76158;
      if(h_92084.value == null)
        h_92084.value = term;
      else
        if(h_92084.value != term && !h_92084.value.match(term))
          break Fail76158;
      Success41818:
      { 
        Fail76159:
        { 
          IStrategoTerm n_92084 = null;
          n_92084 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, n_92084, trans.const15450, i_92084.value);
          if(term == null)
            break Fail76159;
          if(true)
            break Success41818;
        }
        term = trans.constNil11;
      }
      lifted21602 lifted216020 = new lifted21602();
      lifted216020.h_92084 = h_92084;
      lifted216020.i_92084 = i_92084;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted216020, k_92084);
      if(term == null)
        break Fail76158;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}