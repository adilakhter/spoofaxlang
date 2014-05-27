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

@SuppressWarnings("all") public class bagof_$Is$Imported_0_0 extends Strategy 
{ 
  public static bagof_$Is$Imported_0_0 instance = new bagof_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_IsImported_0_0");
    Fail23024:
    { 
      TermReference r_4645 = new TermReference();
      TermReference s_4645 = new TermReference();
      if(s_4645.value == null)
        s_4645.value = term;
      else
        if(s_4645.value != term && !s_4645.value.match(term))
          break Fail23024;
      if(r_4645.value == null)
        r_4645.value = term;
      else
        if(r_4645.value != term && !r_4645.value.match(term))
          break Fail23024;
      Success12230:
      { 
        Fail23025:
        { 
          IStrategoTerm w_4645 = null;
          w_4645 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, w_4645, trans.const4487, s_4645.value);
          if(term == null)
            break Fail23025;
          if(true)
            break Success12230;
        }
        term = trans.constNil4;
      }
      lifted6910 lifted69100 = new lifted6910();
      lifted69100.r_4645 = r_4645;
      lifted69100.s_4645 = s_4645;
      term = filter_1_0.instance.invoke(context, term, lifted69100);
      if(term == null)
        break Fail23024;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}