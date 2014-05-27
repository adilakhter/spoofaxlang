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

@SuppressWarnings("all") public class bigbagof_$Is$Imported_0_0 extends Strategy 
{ 
  public static bigbagof_$Is$Imported_0_0 instance = new bigbagof_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_IsImported_0_0");
    Fail21968:
    { 
      TermReference o_4286 = new TermReference();
      TermReference p_4286 = new TermReference();
      if(p_4286.value == null)
        p_4286.value = term;
      else
        if(p_4286.value != term && !p_4286.value.match(term))
          break Fail21968;
      if(o_4286.value == null)
        o_4286.value = term;
      else
        if(o_4286.value != term && !o_4286.value.match(term))
          break Fail21968;
      Success11882:
      { 
        Fail21969:
        { 
          IStrategoTerm t_4286 = null;
          t_4286 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, t_4286, trans.const4327, p_4286.value);
          if(term == null)
            break Fail21969;
          if(true)
            break Success11882;
        }
        term = trans.constNil3;
      }
      lifted6718 lifted67180 = new lifted6718();
      lifted67180.o_4286 = o_4286;
      lifted67180.p_4286 = p_4286;
      term = filter_1_0.instance.invoke(context, term, lifted67180);
      if(term == null)
        break Fail21968;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}