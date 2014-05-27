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

@SuppressWarnings("all") public class bigbagof_$Is$Imported$Failed_0_0 extends Strategy 
{ 
  public static bigbagof_$Is$Imported$Failed_0_0 instance = new bigbagof_$Is$Imported$Failed_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_IsImportedFailed_0_0");
    Fail23676:
    { 
      TermReference p_4879 = new TermReference();
      TermReference q_4879 = new TermReference();
      if(q_4879.value == null)
        q_4879.value = term;
      else
        if(q_4879.value != term && !q_4879.value.match(term))
          break Fail23676;
      if(p_4879.value == null)
        p_4879.value = term;
      else
        if(p_4879.value != term && !p_4879.value.match(term))
          break Fail23676;
      Success12671:
      { 
        Fail23677:
        { 
          IStrategoTerm u_4879 = null;
          u_4879 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, u_4879, trans.const4576, q_4879.value);
          if(term == null)
            break Fail23677;
          if(true)
            break Success12671;
        }
        term = trans.constNil4;
      }
      lifted7070 lifted70700 = new lifted7070();
      lifted70700.p_4879 = p_4879;
      lifted70700.q_4879 = q_4879;
      term = filter_1_0.instance.invoke(context, term, lifted70700);
      if(term == null)
        break Fail23676;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}