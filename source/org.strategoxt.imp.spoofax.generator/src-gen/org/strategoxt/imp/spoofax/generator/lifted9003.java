package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted9003 extends Strategy 
{ 
  public static final lifted9003 instance = new lifted9003();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail29036:
    { 
      term = get_sdf_main_module_0_0.instance.invoke(context, generator.const6968);
      if(term == null)
        break Fail29036;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const6984, termFactory.makeListCons(term, (IStrategoList)generator.constCons4540));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail29036;
      if(true)
        return term;
    }
    return null;
  }
}