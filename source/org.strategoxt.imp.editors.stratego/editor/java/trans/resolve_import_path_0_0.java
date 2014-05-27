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
    Fail23132:
    { 
      TermReference y_4786 = new TermReference();
      IStrategoTerm t_4787 = null;
      IStrategoTerm v_4787 = null;
      IStrategoTerm x_4787 = null;
      if(y_4786.value == null)
        y_4786.value = term;
      else
        if(y_4786.value != term && !y_4786.value.match(term))
          break Fail23132;
      v_4787 = term;
      Success12373:
      { 
        Fail23133:
        { 
          term = load_include_paths_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23133;
          if(true)
            break Success12373;
        }
        term = trans.constNil4;
      }
      t_4787 = term;
      term = v_4787;
      term = default_include_paths_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23132;
      term = termFactory.makeTuple(t_4787, term);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23132;
      term = map_1_0.instance.invoke(context, term, lifted6863.instance);
      if(term == null)
        break Fail23132;
      x_4787 = term;
      term = x_4787;
      lifted6865 lifted68650 = new lifted6865();
      lifted68650.y_4786 = y_4786;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted68650);
      if(term == null)
        break Fail23132;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}