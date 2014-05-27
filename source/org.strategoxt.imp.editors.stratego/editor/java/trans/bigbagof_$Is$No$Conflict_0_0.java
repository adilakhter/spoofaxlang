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

@SuppressWarnings("all") public class bigbagof_$Is$No$Conflict_0_0 extends Strategy 
{ 
  public static bigbagof_$Is$No$Conflict_0_0 instance = new bigbagof_$Is$No$Conflict_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_IsNoConflict_0_0");
    Fail23781:
    { 
      TermReference t_4896 = new TermReference();
      TermReference u_4896 = new TermReference();
      if(u_4896.value == null)
        u_4896.value = term;
      else
        if(u_4896.value != term && !u_4896.value.match(term))
          break Fail23781;
      if(t_4896.value == null)
        t_4896.value = term;
      else
        if(t_4896.value != term && !t_4896.value.match(term))
          break Fail23781;
      Success12699:
      { 
        Fail23782:
        { 
          IStrategoTerm y_4896 = null;
          y_4896 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, y_4896, trans.const4637, u_4896.value);
          if(term == null)
            break Fail23782;
          if(true)
            break Success12699;
        }
        term = trans.constNil4;
      }
      lifted7107 lifted71070 = new lifted7107();
      lifted71070.t_4896 = t_4896;
      lifted71070.u_4896 = u_4896;
      term = filter_1_0.instance.invoke(context, term, lifted71070);
      if(term == null)
        break Fail23781;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}