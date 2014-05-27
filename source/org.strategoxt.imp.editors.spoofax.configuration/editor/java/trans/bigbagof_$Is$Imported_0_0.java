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

@SuppressWarnings("all") public class bigbagof_$Is$Imported_0_0 extends Strategy 
{ 
  public static bigbagof_$Is$Imported_0_0 instance = new bigbagof_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_IsImported_0_0");
    Fail23019:
    { 
      TermReference u_4644 = new TermReference();
      TermReference v_4644 = new TermReference();
      if(v_4644.value == null)
        v_4644.value = term;
      else
        if(v_4644.value != term && !v_4644.value.match(term))
          break Fail23019;
      if(u_4644.value == null)
        u_4644.value = term;
      else
        if(u_4644.value != term && !u_4644.value.match(term))
          break Fail23019;
      Success12228:
      { 
        Fail23020:
        { 
          IStrategoTerm z_4644 = null;
          z_4644 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, z_4644, trans.const4487, v_4644.value);
          if(term == null)
            break Fail23020;
          if(true)
            break Success12228;
        }
        term = trans.constNil4;
      }
      lifted6907 lifted69070 = new lifted6907();
      lifted69070.u_4644 = u_4644;
      lifted69070.v_4644 = v_4644;
      term = filter_1_0.instance.invoke(context, term, lifted69070);
      if(term == null)
        break Fail23019;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}