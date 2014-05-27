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

@SuppressWarnings("all") final class lifted9054 extends Strategy 
{ 
  public static final lifted9054 instance = new lifted9054();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28982:
    { 
      IStrategoTerm q_4227 = null;
      q_4227 = term;
      term = termFactory.makeTuple(generator.const7049, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consIncludeDef_1, new IStrategoTerm[]{term}), (IStrategoList)generator.constNil7));
      term = extend_config_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28982;
      term = q_4227;
      if(true)
        return term;
    }
    return null;
  }
}