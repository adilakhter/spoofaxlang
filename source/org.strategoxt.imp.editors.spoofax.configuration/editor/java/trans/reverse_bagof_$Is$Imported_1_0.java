package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class reverse_bagof_$Is$Imported_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Is$Imported_1_0 instance = new reverse_bagof_$Is$Imported_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_17589)
  { 
    context.push("reverse_bagof_IsImported_1_0");
    Fail87830:
    { 
      TermReference h_17589 = new TermReference();
      TermReference i_17589 = new TermReference();
      if(i_17589.value == null)
        i_17589.value = term;
      else
        if(i_17589.value != term && !i_17589.value.match(term))
          break Fail87830;
      if(h_17589.value == null)
        h_17589.value = term;
      else
        if(h_17589.value != term && !h_17589.value.match(term))
          break Fail87830;
      Success47316:
      { 
        Fail87831:
        { 
          IStrategoTerm n_17589 = null;
          n_17589 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, n_17589, trans.const17874, i_17589.value);
          if(term == null)
            break Fail87831;
          if(true)
            break Success47316;
        }
        term = trans.constNil14;
      }
      lifted24794 lifted247940 = new lifted24794();
      lifted247940.h_17589 = h_17589;
      lifted247940.i_17589 = i_17589;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted247940, k_17589);
      if(term == null)
        break Fail87830;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}