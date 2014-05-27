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

@SuppressWarnings("all") public class resolve_import_path_0_0 extends Strategy 
{ 
  public static resolve_import_path_0_0 instance = new resolve_import_path_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("resolve_import_path_0_0");
    Fail21656:
    { 
      TermReference g_4233 = new TermReference();
      IStrategoTerm b_4234 = null;
      IStrategoTerm d_4234 = null;
      IStrategoTerm f_4234 = null;
      if(g_4233.value == null)
        g_4233.value = term;
      else
        if(g_4233.value != term && !g_4233.value.match(term))
          break Fail21656;
      d_4234 = term;
      Success11664:
      { 
        Fail21657:
        { 
          term = load_include_paths_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21657;
          if(true)
            break Success11664;
        }
        term = trans.constNil3;
      }
      b_4234 = term;
      term = d_4234;
      term = default_include_paths_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21656;
      term = termFactory.makeTuple(b_4234, term);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21656;
      term = map_1_0.instance.invoke(context, term, lifted6592.instance);
      if(term == null)
        break Fail21656;
      f_4234 = term;
      term = f_4234;
      lifted6594 lifted65940 = new lifted6594();
      lifted65940.g_4233 = g_4233;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted65940);
      if(term == null)
        break Fail21656;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}