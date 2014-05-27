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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_4645)
  { 
    context.push("reverse_bagof_IsImported_1_0");
    Fail23022:
    { 
      TermReference k_4645 = new TermReference();
      TermReference l_4645 = new TermReference();
      if(l_4645.value == null)
        l_4645.value = term;
      else
        if(l_4645.value != term && !l_4645.value.match(term))
          break Fail23022;
      if(k_4645.value == null)
        k_4645.value = term;
      else
        if(k_4645.value != term && !k_4645.value.match(term))
          break Fail23022;
      Success12229:
      { 
        Fail23023:
        { 
          IStrategoTerm q_4645 = null;
          q_4645 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, q_4645, trans.const4487, l_4645.value);
          if(term == null)
            break Fail23023;
          if(true)
            break Success12229;
        }
        term = trans.constNil4;
      }
      lifted6909 lifted69090 = new lifted6909();
      lifted69090.k_4645 = k_4645;
      lifted69090.l_4645 = l_4645;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted69090, n_4645);
      if(term == null)
        break Fail23022;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}